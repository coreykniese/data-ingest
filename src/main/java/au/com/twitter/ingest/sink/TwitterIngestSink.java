package au.com.twitter.ingest.sink;

import java.util.concurrent.BlockingQueue;

import org.apache.log4j.Logger;

import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.event.Event;

import au.com.twitter.ingest.domain.TweetData;
import au.com.twitter.ingest.mapper.JSONDataMapper;
import au.com.twitter.ingest.service.TwitterIngestService;

public class TwitterIngestSink {

    private static final Logger LOGGER = Logger.getLogger(TwitterIngestSink.class);

    private Client hosebirdClient;
    private TwitterIngestService service;
    private BlockingQueue<String> msgQueue;
    private BlockingQueue<Event> eventQueue;

    public TwitterIngestSink(ClientBuilder clientBuilder, TwitterIngestService service, BlockingQueue<String> msgQueue,
            BlockingQueue<Event> eventQueue) {
        this.service = service;
        this.msgQueue = msgQueue;
        this.eventQueue = eventQueue;
        this.hosebirdClient = clientBuilder.build();
    }

    public void init() {
        this.hosebirdClient.connect();
    }

    public void process() {
        while (!hosebirdClient.isDone()) {
            try {
                String msg = msgQueue.take();
                LOGGER.info(msg);
                this.service.writeTwitterIngestMessage(msg);        
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}