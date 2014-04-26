package au.com.afl.ingest.twitter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import au.com.afl.test.AbstractBaseContextTest;
import au.com.twitter.ingest.TwitterIngest;


@RunWith(SpringJUnit4ClassRunner.class)
public class TestTwitterIngest extends AbstractBaseContextTest {

    public TwitterIngest twitterIngest;
    
    public TestTwitterIngest() {
        // TODO Auto-generated constructor stub
    }

    @Before
    public void setUp() {
        twitterIngest = (TwitterIngest) applicationContext.getBean("twitterIngest");
    }
    
    
    @Test
    public void test_setup() {
        
        Assert.assertNotNull(twitterIngest);
    }
    
    @Test
    public void test_listen() {
        twitterIngest.listen();
    }
}
