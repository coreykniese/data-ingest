package au.com.afl.test;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {
        "classpath:application-context.xml"
        })
public abstract class AbstractBaseContextTest extends AbstractJUnit4SpringContextTests {

}
