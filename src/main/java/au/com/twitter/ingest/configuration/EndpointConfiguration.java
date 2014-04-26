package au.com.twitter.ingest.configuration;


public class EndpointConfiguration {

    private final int msgQueueSize;
    private final int eventQueueSize;
    
    public EndpointConfiguration(final int msgQueueSize, final int eventQueueSize) {
        this.msgQueueSize = msgQueueSize;
        this.eventQueueSize = eventQueueSize;
    }

    
    /**
     * @return the msgQueueSize
     */
    public int getMsgQueueSize() {
        return msgQueueSize;
    }

    
    /**
     * @return the eventQueueSize
     */
    public int getEventQueueSize() {
        return eventQueueSize;
    }

}
