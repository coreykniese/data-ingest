package au.com.twitter.ingest.main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import au.com.afl.test.AbstractBaseContextTest;
import au.com.twitter.ingest.sink.TwitterIngestSink;


@RunWith(SpringJUnit4ClassRunner.class)
public class TestTwitterIngest extends AbstractBaseContextTest {

    public TwitterIngestSink twitterIngest;
    
    public TestTwitterIngest() {
        // TODO Auto-generated constructor stub
    }

    @Before
    public void setUp() {
        twitterIngest = (TwitterIngestSink) applicationContext.getBean("ingestSink");
    }
    
    
    @Test
    public void test_setup() {
        
        Assert.assertNotNull(twitterIngest);
    }
    
    @Test
    public void test_listen() {
        twitterIngest.init();
    }
}
