package au.com.twitter.ingest.model;

import java.util.concurrent.BlockingQueue;

import com.google.common.base.Preconditions;
import com.twitter.hbc.BasicReconnectionManager;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.RateTracker;
import com.twitter.hbc.ReconnectionManager;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.endpoint.RawEndpoint;
import com.twitter.hbc.core.endpoint.StreamingEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.HosebirdMessageProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;

public class TwitterClientBuilder extends ClientBuilder {

    public TwitterClientBuilder() {
        super();
    }

    public void setName(String name) {
        this.name = ((String) Preconditions.checkNotNull(name));
    }

    public void setGzipEnabled(boolean gzip) {
        this.enableGZip = gzip;

    }

    public void setHosts(Hosts hosts) {
        this.hosts = ((Hosts) Preconditions.checkNotNull(hosts));

    }

    public void setEndpoint(StreamingEndpoint endpoint) {
        this.endpoint = ((StreamingEndpoint) Preconditions.checkNotNull(endpoint));

    }

    public void setAuthentication(Authentication auth) {
        this.auth = auth;

    }

    public void setProcessor(HosebirdMessageProcessor processor) {
        this.processor = processor;

    }

    public void setEventMessageQueue(BlockingQueue<Event> events) {
        this.eventQueue = events;

    }
    
    public BlockingQueue<Event> getEventMessageQueue() {
        return this.eventQueue;
    }

    public void setSocketTimeout(int millis) {
        this.socketTimeoutMillis = millis;

    }

    public void setConnectionTimeout(int millis) {
        this.connectionTimeoutMillis = millis;

    }

    public void setRetries(int retries) {
        this.reconnectionManager = new BasicReconnectionManager(retries);

    }

    public void setReconnectionManager(ReconnectionManager manager) {
        this.reconnectionManager = ((ReconnectionManager) Preconditions.checkNotNull(manager));

    }

    public void setEndpoint(String uri, String httpMethod) {
        Preconditions.checkNotNull(uri);
        this.endpoint = new RawEndpoint(uri, httpMethod);

    }

    public void setRateTracker(RateTracker rateTracker) {
        this.rateTracker = ((RateTracker) Preconditions.checkNotNull(rateTracker));

    }
}
