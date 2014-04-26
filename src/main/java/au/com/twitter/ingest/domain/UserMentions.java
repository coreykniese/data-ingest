package au.com.twitter.ingest.domain;

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
@JsonPropertyOrder({ "id", "id_str", "indices", "name", "screen_name" })
public class UserMentions {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("indices")
    private List<Integer> indices = new ArrayList<Integer>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("screen_name")
    private String screen_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public UserMentions withId(Integer id) {
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

    public UserMentions withId_str(String id_str) {
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

    public UserMentions withIndices(List<Integer> indices) {
        this.indices = indices;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public UserMentions withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("screen_name")
    public String getScreen_name() {
        return screen_name;
    }

    @JsonProperty("screen_name")
    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public UserMentions withScreen_name(String screen_name) {
        this.screen_name = screen_name;
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
