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
@JsonPropertyOrder({ "large", "medium", "small", "thumb" })
public class Sizes {

    @JsonProperty("large")
    private Large large;
    @JsonProperty("medium")
    private Medium medium;
    @JsonProperty("small")
    private Small small;
    @JsonProperty("thumb")
    private Thumb thumb;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("large")
    public Large getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(Large large) {
        this.large = large;
    }

    public Sizes withLarge(Large large) {
        this.large = large;
        return this;
    }

    @JsonProperty("medium")
    public Medium getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Sizes withMedium(Medium medium) {
        this.medium = medium;
        return this;
    }

    @JsonProperty("small")
    public Small getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(Small small) {
        this.small = small;
    }

    public Sizes withSmall(Small small) {
        this.small = small;
        return this;
    }

    @JsonProperty("thumb")
    public Thumb getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public Sizes withThumb(Thumb thumb) {
        this.thumb = thumb;
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
