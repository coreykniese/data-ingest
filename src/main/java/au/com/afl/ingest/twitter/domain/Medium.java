package au.com.afl.ingest.twitter.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "display_url", "expanded_url", "id", "id_str", "indices", "media_url", "media_url_https", "sizes", "type", "url" })
public class Medium {

    @JsonProperty("display_url")
    private String display_url;
    @JsonProperty("expanded_url")
    private String expanded_url;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("indices")
    private List<Integer> indices = new ArrayList<Integer>();
    @JsonProperty("media_url")
    private String media_url;
    @JsonProperty("media_url_https")
    private String media_url_https;
    @JsonProperty("sizes")
    private Sizes sizes;
    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("display_url")
    public String getDisplay_url() {
        return display_url;
    }

    @JsonProperty("display_url")
    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public Medium withDisplay_url(String display_url) {
        this.display_url = display_url;
        return this;
    }

    @JsonProperty("expanded_url")
    public String getExpanded_url() {
        return expanded_url;
    }

    @JsonProperty("expanded_url")
    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }

    public Medium withExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
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

    public Medium withId(Double id) {
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

    public Medium withId_str(String id_str) {
        this.id_str = id_str;
        return this;
    }

    @JsonProperty("indices")
    public List<Integer> getIndices() {
        return indices;
    }

    @JsonProperty("indices")
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    public Medium withIndices(List<Integer> indices) {
        this.indices = indices;
        return this;
    }

    @JsonProperty("media_url")
    public String getMedia_url() {
        return media_url;
    }

    @JsonProperty("media_url")
    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }

    public Medium withMedia_url(String media_url) {
        this.media_url = media_url;
        return this;
    }

    @JsonProperty("media_url_https")
    public String getMedia_url_https() {
        return media_url_https;
    }

    @JsonProperty("media_url_https")
    public void setMedia_url_https(String media_url_https) {
        this.media_url_https = media_url_https;
    }

    public Medium withMedia_url_https(String media_url_https) {
        this.media_url_https = media_url_https;
        return this;
    }

    @JsonProperty("sizes")
    public Sizes getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public Medium withSizes(Sizes sizes) {
        this.sizes = sizes;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Medium withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Medium withUrl(String url) {
        this.url = url;
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
