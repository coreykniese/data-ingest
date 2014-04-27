package au.com.twitter.ingest.processor;

import org.apache.log4j.Logger;

import au.com.twitter.ingest.domain.TweetData;
import au.com.twitter.ingest.mapper.JSONDataMapper;


public class IngestProcessor {

    private static final Logger LOGGER = Logger.getLogger(IngestProcessor.class);
    
    JSONDataMapper<TweetData> mapper = new JSONDataMapper<TweetData>(TweetData.class);
    
    public IngestProcessor() {
        // TODO Auto-generated constructor stub
    }

    public void process(final String data) {
        TweetData tweet = this.mapData(data);
        this.write(tweet);
    }
    
    protected void write(TweetData tweet) {
        LOGGER.info(tweet);
    }

    protected TweetData mapData(final String data) {
        return mapper.mapResponse(data);
    }
    
}
