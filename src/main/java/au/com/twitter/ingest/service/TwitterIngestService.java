package au.com.twitter.ingest.service;


public interface TwitterIngestService {

    public abstract void writeTwitterIngestMessage(final String twitterIngestMessage);
    
}
