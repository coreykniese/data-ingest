package au.com.twitter.ingest;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.Logger;

import au.com.twitter.ingest.configuration.EndpointConfiguration;
import au.com.twitter.ingest.configuration.OAuthConfiguration;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.endpoint.StreamingEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;


public class TwitterIngest {

    private static final Logger LOGGER = Logger.getLogger(TwitterIngest.class);
    
    final BlockingQueue<String> msgQueue;
    final BlockingQueue<Event> eventQueue;
    
    Hosts hosebirdHosts;
    StreamingEndpoint hosebirdEndpoint;
    Authentication hosebirdAuth;
    Client hosebirdClient;
    
    public TwitterIngest(final EndpointConfiguration endpointConfiguration, final OAuthConfiguration oAuthConfiguration) {
        msgQueue = new LinkedBlockingQueue<String>(endpointConfiguration.getMsgQueueSize());
        eventQueue = new LinkedBlockingQueue<Event>(endpointConfiguration.getEventQueueSize());
        
        initEndpoint(oAuthConfiguration);
        createClient();
    }
    
    
    private void initEndpoint(final OAuthConfiguration oAuthConfiguration) {
        
        hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
        hosebirdEndpoint = new StatusesFilterEndpoint();
        // Optional: set up some followings and track terms
        List<Long> followings = Lists.newArrayList(1234L, 566788L);
        List<String> terms = Lists.newArrayList("twitter", "api");
        ((StatusesFilterEndpoint) hosebirdEndpoint).followings(followings);
        ((StatusesFilterEndpoint) hosebirdEndpoint).trackTerms(terms);

        // These secrets should be read from a config file
        hosebirdAuth = new OAuth1(oAuthConfiguration.getConsumerKey(), oAuthConfiguration.getConsumerSecret(), oAuthConfiguration.getToken(), oAuthConfiguration.getSecret());
    }
    
    
    public void createClient() {
        ClientBuilder builder = new ClientBuilder()
        .name("Hosebird-Client-01")                              // optional: mainly for the logs
        .hosts(hosebirdHosts)
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
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
          }
    }
}
