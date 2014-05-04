package au.com.twitter.ingest.main;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.Logger;

import au.com.twitter.ingest.configuration.EndpointConfiguration;
import au.com.twitter.ingest.configuration.OAuthConfiguration;
import au.com.twitter.ingest.sink.TwitterIngestSink;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;


public class TwitterIngestRunner {

    private static final Logger LOGGER = Logger.getLogger(TwitterIngestRunner.class);
    
    private BlockingQueue<String> msgQueue;
    private BlockingQueue<Event> eventQueue;
    
    final TwitterIngestSink ingestSink;
    
    
    Authentication hosebirdAuth;
    Client hosebirdClient;
    
    public TwitterIngestRunner(final EndpointConfiguration endpointConfiguration, final OAuthConfiguration oAuthConfiguration, final TwitterIngestSink ingestProcessor) {
        
        initEndpoint(endpointConfiguration, oAuthConfiguration);
        this.ingestSink = ingestProcessor;
    }
    
    
    private void initEndpoint(final EndpointConfiguration endpointConfiguration, final OAuthConfiguration oAuthConfiguration) {
        msgQueue = new LinkedBlockingQueue<String>(endpointConfiguration.getMsgQueueSize());
        eventQueue = new LinkedBlockingQueue<Event>(endpointConfiguration.getEventQueueSize());
        
        StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
        // Optional: set up some followings and track terms
        List<Long> followings = Lists.newArrayList(1234L, 566788L);
        List<String> terms = Lists.newArrayList("twitter", "api");
        
        hosebirdEndpoint.followings(followings);
        hosebirdEndpoint.trackTerms(terms);

        // These secrets should be read from a config file
        hosebirdAuth = new OAuth1(oAuthConfiguration.getConsumerKey(), oAuthConfiguration.getConsumerSecret(), oAuthConfiguration.getToken(), oAuthConfiguration.getSecret());
    
        ClientBuilder builder = new ClientBuilder()
            .name("Hosebird-Client-01")                              // optional: mainly for the logs
            .hosts(new HttpHosts(Constants.STREAM_HOST))
            .authentication(hosebirdAuth)
            .endpoint(hosebirdEndpoint)
            .processor(new StringDelimitedProcessor(msgQueue))
            .eventMessageQueue(eventQueue);                          // optional: use this if you want to process client events

      hosebirdClient = builder.build();
      // Attempts to establish a connection.
      hosebirdClient.connect();

    }
    
    public void listen() {
        while (!hosebirdClient.isDone()) {
            try {
                String msg = msgQueue.take();
                LOGGER.info(msg);
                ingestSink.process(msg);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
          }
    }
    
    
}
