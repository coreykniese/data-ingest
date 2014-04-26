package au.com.twitter.ingest.domain;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "contributors", "coordinates", "created_at", "entities", "favorite_count", "favorited", "filter_level", "geo", "id",
        "id_str", "in_reply_to_screen_name", "in_reply_to_status_id", "in_reply_to_status_id_str", "in_reply_to_user_id",
        "in_reply_to_user_id_str", "lang", "place", "possibly_sensitive", "retweet_count", "retweeted", "retweeted_status", "source",
        "text", "truncated", "user" })
public class TweetData {

    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("entities")
    private Entities entities;
    @JsonProperty("favorite_count")
    private Integer favorite_count;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("filter_level")
    private String filter_level;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("in_reply_to_screen_name")
    private Object in_reply_to_screen_name;
    @JsonProperty("in_reply_to_status_id")
    private Object in_reply_to_status_id;
    @JsonProperty("in_reply_to_status_id_str")
    private Object in_reply_to_status_id_str;
    @JsonProperty("in_reply_to_user_id")
    private Object in_reply_to_user_id;
    @JsonProperty("in_reply_to_user_id_str")
    private Object in_reply_to_user_id_str;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("possibly_sensitive")
    private Boolean possibly_sensitive;
    @JsonProperty("retweet_count")
    private Integer retweet_count;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("retweeted_status")
    private RetweetedStatus retweeted_status;
    @JsonProperty("source")
    private String source;
    @JsonProperty("text")
    private String text;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("user")
    private User user;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public TweetData withContributors(Object contributors) {
        this.contributors = contributors;
        return this;
    }

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public TweetData withCoordinates(Object coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public TweetData withCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public TweetData withEntities(Entities entities) {
        this.entities = entities;
        return this;
    }

    @JsonProperty("favorite_count")
    public Integer getFavorite_count() {
        return favorite_count;
    }

    @JsonProperty("favorite_count")
    public void setFavorite_count(Integer favorite_count) {
        this.favorite_count = favorite_count;
    }

    public TweetData withFavorite_count(Integer favorite_count) {
        this.favorite_count = favorite_count;
        return this;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public TweetData withFavorited(Boolean favorited) {
        this.favorited = favorited;
        return this;
    }

    @JsonProperty("filter_level")
    public String getFilter_level() {
        return filter_level;
    }

    @JsonProperty("filter_level")
    public void setFilter_level(String filter_level) {
        this.filter_level = filter_level;
    }

    public TweetData withFilter_level(String filter_level) {
        this.filter_level = filter_level;
        return this;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public TweetData withGeo(Object geo) {
        this.geo = geo;
        return this;
    }

    @JsonProperty("id")
    public Double getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Double id) {
        this.id = id;
    }

    public TweetData withId(Double id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id_str")
    public String getId_str() {
        return id_str;
    }

    @JsonProperty("id_str")
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public TweetData withId_str(String id_str) {
        this.id_str = id_str;
        return this;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setIn_reply_to_screen_name(Object in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public TweetData withIn_reply_to_screen_name(Object in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
        return this;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setIn_reply_to_status_id(Object in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public TweetData withIn_reply_to_status_id(Object in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
        return this;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setIn_reply_to_status_id_str(Object in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    public TweetData withIn_reply_to_status_id_str(Object in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
        return this;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setIn_reply_to_user_id(Object in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public TweetData withIn_reply_to_user_id(Object in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
        return this;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setIn_reply_to_user_id_str(Object in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    public TweetData withIn_reply_to_user_id_str(Object in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
        return this;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    public TweetData withLang(String lang) {
        this.lang = lang;
        return this;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    public TweetData withPlace(Object place) {
        this.place = place;
        return this;
    }

    @JsonProperty("possibly_sensitive")
    public Boolean getPossibly_sensitive() {
        return possibly_sensitive;
    }

    @JsonProperty("possibly_sensitive")
    public void setPossibly_sensitive(Boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    public TweetData withPossibly_sensitive(Boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
        return this;
    }

    @JsonProperty("retweet_count")
    public Integer getRetweet_count() {
        return retweet_count;
    }

    @JsonProperty("retweet_count")
    public void setRetweet_count(Integer retweet_count) {
        this.retweet_count = retweet_count;
    }

    public TweetData withRetweet_count(Integer retweet_count) {
        this.retweet_count = retweet_count;
        return this;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public TweetData withRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
        return this;
    }

    @JsonProperty("retweeted_status")
    public RetweetedStatus getRetweeted_status() {
        return retweeted_status;
    }

    @JsonProperty("retweeted_status")
    public void setRetweeted_status(RetweetedStatus retweeted_status) {
        this.retweeted_status = retweeted_status;
    }

    public TweetData withRetweeted_status(RetweetedStatus retweeted_status) {
        this.retweeted_status = retweeted_status;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public TweetData withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public TweetData withText(String text) {
        this.text = text;
        return this;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public TweetData withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    public TweetData withUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
