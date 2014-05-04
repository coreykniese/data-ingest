package au.com.twitter.ingest.dao;

import au.com.twitter.ingest.model.TwitterIngestMessage;


public interface TwitterIngestDAO extends GenericDAO<TwitterIngestMessage, Long> {

    public abstract void saveTwitterIngestMessage(final TwitterIngestMessage twitterIngestMessage);
}
