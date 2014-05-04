package au.com.twitter.ingest.service;

import org.springframework.transaction.annotation.Transactional;

import au.com.twitter.ingest.dao.TwitterIngestDAOImpl;
import au.com.twitter.ingest.model.TwitterIngestMessage;


public class TwitterIngestServiceImpl implements TwitterIngestService {

    public final TwitterIngestDAOImpl twitterIngestDAO;
    
    public TwitterIngestServiceImpl(final TwitterIngestDAOImpl twitterIngestDAO) {
        this.twitterIngestDAO = twitterIngestDAO;
    }

    @Override
    @Transactional
    public void writeTwitterIngestMessage(String rawContent) {
        TwitterIngestMessage twitterIngestMessage = new TwitterIngestMessage();
        twitterIngestMessage.setTwitterMsg(rawContent);
        
        
        this.twitterIngestDAO.saveOrUpdate(twitterIngestMessage);
    }

    
    
}
