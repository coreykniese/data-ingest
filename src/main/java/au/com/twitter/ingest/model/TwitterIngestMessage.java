package au.com.twitter.ingest.model;

import java.util.Date;

public class TwitterIngestMessage extends BaseDataEntity<Long> {

    private static final long serialVersionUID = -2553238817893249988L;
    
    private Long twitterId;
    private String twitterMsg;
    private String status = "N";
    private Date created = new Date();
    private Date modified = new Date();

    public TwitterIngestMessage() {
        super();
    }

    public TwitterIngestMessage(Long twitterId, String twitterMsg, String status, Date created, Date modified) {
        super();
        
        this.twitterId = twitterId;
        this.twitterMsg = twitterMsg;
        this.status = status;
        this.created = created;
        this.modified = modified;
    }

    /**
     * @return the twitterId
     */
    public Long getTwitterId() {
        return twitterId;
    }

    /**
     * @param twitterId
     *            the twitterId to set
     */
    public void setTwitterId(Long twitterId) {
        this.twitterId = twitterId;
    }

    /**
     * @return the twitterMsg
     */
    public String getTwitterMsg() {
        return twitterMsg;
    }

    /**
     * @param twitterMsg
     *            the twitterMsg to set
     */
    public void setTwitterMsg(String twitterMsg) {
        this.twitterMsg = twitterMsg;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     *            the created to set
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified
     *            the modified to set
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

}
