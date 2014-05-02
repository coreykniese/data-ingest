package au.com.twitter.ingest.model;

import java.util.Date;

public class TwitterDataDTO {

    private long id;
    private long twitterId;
    private String twitterMsg;
    private String status;
    private Date created;
    private Date modified;

    public TwitterDataDTO() {
        // TODO Auto-generated constructor stub
    }

    public TwitterDataDTO(long id, long twitterId, String twitterMsg, String status, Date created, Date modified) {
        super();
        this.id = id;
        this.twitterId = twitterId;
        this.twitterMsg = twitterMsg;
        this.status = status;
        this.created = created;
        this.modified = modified;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the twitterId
     */
    public long getTwitterId() {
        return twitterId;
    }

    /**
     * @param twitterId
     *            the twitterId to set
     */
    public void setTwitterId(long twitterId) {
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
