package au.com.twitter.ingest.dao;

import au.com.twitter.ingest.model.TwitterIngestMessage;

public class TwitterIngestDAOImpl extends GenericHibernateDAO<TwitterIngestMessage, Long> implements TwitterIngestDAO {

    public TwitterIngestDAOImpl() {
        super(TwitterIngestMessage.class);
    }

    @Override
    public void saveTwitterIngestMessage(final TwitterIngestMessage twitterIngestMessage) {
        saveOrUpdate(twitterIngestMessage);
    }

    
}
