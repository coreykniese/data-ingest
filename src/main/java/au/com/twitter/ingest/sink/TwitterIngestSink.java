package au.com.twitter.ingest.sink;

import org.apache.log4j.Logger;

import au.com.twitter.ingest.domain.TweetData;
import au.com.twitter.ingest.mapper.JSONDataMapper;
import au.com.twitter.ingest.service.TwitterIngestService;


public class TwitterIngestSink {

    private static final Logger LOGGER = Logger.getLogger(TwitterIngestSink.class);
    
    JSONDataMapper<TweetData> mapper = new JSONDataMapper<TweetData>(TweetData.class);
    
    TwitterIngestService service;
    
    public TwitterIngestSink(TwitterIngestService service) {
        this.service = service;
    }

    public void process(final String data) {
        this.service.writeTwitterIngestMessage(data);
    }
    
    protected void write(TweetData tweet) {
        LOGGER.info(tweet);
    }

    protected TweetData mapData(final String data) {
        return mapper.mapResponse(data);
    }
    
}
