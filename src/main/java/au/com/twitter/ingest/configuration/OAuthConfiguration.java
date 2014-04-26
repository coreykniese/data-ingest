package au.com.twitter.ingest.configuration;

public class OAuthConfiguration {

    private final String consumerKey;
    private final String consumerSecret;
    private final String token;
    private final String secret;

    public OAuthConfiguration(final String consumerKey, final String consumerSecret, final String token, final String secret) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.token = token;
        this.secret = secret;
    }

    /**
     * @return the consumerKey
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * @return the consumerSecret
     */
    public String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @return the secret
     */
    public String getSecret() {
        return secret;
    }

}
