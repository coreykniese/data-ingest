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
@JsonPropertyOrder({ "contributors_enabled", "created_at", "default_profile", "default_profile_image", "description", "favourites_count",
        "follow_request_sent", "followers_count", "following", "friends_count", "geo_enabled", "id", "id_str", "is_translation_enabled",
        "is_translator", "lang", "listed_count", "location", "name", "notifications", "profile_background_color",
        "profile_background_image_url", "profile_background_image_url_https", "profile_background_tile", "profile_banner_url",
        "profile_image_url", "profile_image_url_https", "profile_link_color", "profile_sidebar_border_color", "profile_sidebar_fill_color",
        "profile_text_color", "profile_use_background_image", "protected", "screen_name", "statuses_count", "time_zone", "url",
        "utc_offset", "verified" })
public class User {

    @JsonProperty("contributors_enabled")
    private Boolean contributors_enabled;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("default_profile")
    private Boolean default_profile;
    @JsonProperty("default_profile_image")
    private Boolean default_profile_image;
    @JsonProperty("description")
    private String description;
    @JsonProperty("favourites_count")
    private Long favourites_count;
    @JsonProperty("follow_request_sent")
    private Object follow_request_sent;
    @JsonProperty("followers_count")
    private Long followers_count;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("friends_count")
    private Long friends_count;
    @JsonProperty("geo_enabled")
    private Boolean geo_enabled;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("is_translation_enabled")
    private Boolean is_translation_enabled;
    @JsonProperty("is_translator")
    private Boolean is_translator;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("listed_count")
    private Long listed_count;
    @JsonProperty("location")
    private String location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notifications")
    private Object notifications;
    @JsonProperty("profile_background_color")
    private String profile_background_color;
    @JsonProperty("profile_background_image_url")
    private String profile_background_image_url;
    @JsonProperty("profile_background_image_url_https")
    private String profile_background_image_url_https;
    @JsonProperty("profile_background_tile")
    private Boolean profile_background_tile;
    @JsonProperty("profile_banner_url")
    private String profile_banner_url;
    @JsonProperty("profile_image_url")
    private String profile_image_url;
    @JsonProperty("profile_image_url_https")
    private String profile_image_url_https;
    @JsonProperty("profile_link_color")
    private String profile_link_color;
    @JsonProperty("profile_sidebar_border_color")
    private String profile_sidebar_border_color;
    @JsonProperty("profile_sidebar_fill_color")
    private String profile_sidebar_fill_color;
    @JsonProperty("profile_text_color")
    private String profile_text_color;
    @JsonProperty("profile_use_background_image")
    private Boolean profile_use_background_image;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("screen_name")
    private String screen_name;
    @JsonProperty("statuses_count")
    private Long statuses_count;
    @JsonProperty("time_zone")
    private String time_zone;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("utc_offset")
    private Long utc_offset;
    @JsonProperty("verified")
    private Boolean verified;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contributors_enabled")
    public Boolean getContributors_enabled() {
        return contributors_enabled;
    }

    @JsonProperty("contributors_enabled")
    public void setContributors_enabled(Boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    public User withContributors_enabled(Boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
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

    public User withCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("default_profile")
    public Boolean getDefault_profile() {
        return default_profile;
    }

    @JsonProperty("default_profile")
    public void setDefault_profile(Boolean default_profile) {
        this.default_profile = default_profile;
    }

    public User withDefault_profile(Boolean default_profile) {
        this.default_profile = default_profile;
        return this;
    }

    @JsonProperty("default_profile_image")
    public Boolean getDefault_profile_image() {
        return default_profile_image;
    }

    @JsonProperty("default_profile_image")
    public void setDefault_profile_image(Boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }

    public User withDefault_profile_image(Boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public User withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("favourites_count")
    public Long getFavourites_count() {
        return favourites_count;
    }

    @JsonProperty("favourites_count")
    public void setFavourites_count(Long favourites_count) {
        this.favourites_count = favourites_count;
    }

    public User withFavourites_count(Long favourites_count) {
        this.favourites_count = favourites_count;
        return this;
    }

    @JsonProperty("follow_request_sent")
    public Object getFollow_request_sent() {
        return follow_request_sent;
    }

    @JsonProperty("follow_request_sent")
    public void setFollow_request_sent(Object follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }

    public User withFollow_request_sent(Object follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
        return this;
    }

    @JsonProperty("followers_count")
    public Long getFollowers_count() {
        return followers_count;
    }

    @JsonProperty("followers_count")
    public void setFollowers_count(Long followers_count) {
        this.followers_count = followers_count;
    }

    public User withFollowers_count(Long followers_count) {
        this.followers_count = followers_count;
        return this;
    }

    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    public User withFollowing(Object following) {
        this.following = following;
        return this;
    }

    @JsonProperty("friends_count")
    public Long getFriends_count() {
        return friends_count;
    }

    @JsonProperty("friends_count")
    public void setFriends_count(Long friends_count) {
        this.friends_count = friends_count;
    }

    public User withFriends_count(Long friends_count) {
        this.friends_count = friends_count;
        return this;
    }

    @JsonProperty("geo_enabled")
    public Boolean getGeo_enabled() {
        return geo_enabled;
    }

    @JsonProperty("geo_enabled")
    public void setGeo_enabled(Boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    public User withGeo_enabled(Boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
        return this;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public User withId(Long id) {
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

    public User withId_str(String id_str) {
        this.id_str = id_str;
        return this;
    }

    @JsonProperty("is_translation_enabled")
    public Boolean getIs_translation_enabled() {
        return is_translation_enabled;
    }

    @JsonProperty("is_translation_enabled")
    public void setIs_translation_enabled(Boolean is_translation_enabled) {
        this.is_translation_enabled = is_translation_enabled;
    }

    public User withIs_translation_enabled(Boolean is_translation_enabled) {
        this.is_translation_enabled = is_translation_enabled;
        return this;
    }

    @JsonProperty("is_translator")
    public Boolean getIs_translator() {
        return is_translator;
    }

    @JsonProperty("is_translator")
    public void setIs_translator(Boolean is_translator) {
        this.is_translator = is_translator;
    }

    public User withIs_translator(Boolean is_translator) {
        this.is_translator = is_translator;
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

    public User withLang(String lang) {
        this.lang = lang;
        return this;
    }

    @JsonProperty("listed_count")
    public Long getListed_count() {
        return listed_count;
    }

    @JsonProperty("listed_count")
    public void setListed_count(Long listed_count) {
        this.listed_count = listed_count;
    }

    public User withListed_count(Long listed_count) {
        this.listed_count = listed_count;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public User withLocation(String location) {
        this.location = location;
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

    public User withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    public User withNotifications(Object notifications) {
        this.notifications = notifications;
        return this;
    }

    @JsonProperty("profile_background_color")
    public String getProfile_background_color() {
        return profile_background_color;
    }

    @JsonProperty("profile_background_color")
    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    public User withProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
        return this;
    }

    @JsonProperty("profile_background_image_url")
    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    @JsonProperty("profile_background_image_url")
    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    public User withProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
        return this;
    }

    @JsonProperty("profile_background_image_url_https")
    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    @JsonProperty("profile_background_image_url_https")
    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }

    public User withProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
        return this;
    }

    @JsonProperty("profile_background_tile")
    public Boolean getProfile_background_tile() {
        return profile_background_tile;
    }

    @JsonProperty("profile_background_tile")
    public void setProfile_background_tile(Boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
    }

    public User withProfile_background_tile(Boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
        return this;
    }

    @JsonProperty("profile_banner_url")
    public String getProfile_banner_url() {
        return profile_banner_url;
    }

    @JsonProperty("profile_banner_url")
    public void setProfile_banner_url(String profile_banner_url) {
        this.profile_banner_url = profile_banner_url;
    }

    public User withProfile_banner_url(String profile_banner_url) {
        this.profile_banner_url = profile_banner_url;
        return this;
    }

    @JsonProperty("profile_image_url")
    public String getProfile_image_url() {
        return profile_image_url;
    }

    @JsonProperty("profile_image_url")
    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public User withProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
        return this;
    }

    @JsonProperty("profile_image_url_https")
    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    @JsonProperty("profile_image_url_https")
    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    public User withProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
        return this;
    }

    @JsonProperty("profile_link_color")
    public String getProfile_link_color() {
        return profile_link_color;
    }

    @JsonProperty("profile_link_color")
    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    public User withProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
        return this;
    }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    @JsonProperty("profile_sidebar_border_color")
    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    public User withProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
        return this;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    public User withProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
        return this;
    }

    @JsonProperty("profile_text_color")
    public String getProfile_text_color() {
        return profile_text_color;
    }

    @JsonProperty("profile_text_color")
    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    public User withProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
        return this;
    }

    @JsonProperty("profile_use_background_image")
    public Boolean getProfile_use_background_image() {
        return profile_use_background_image;
    }

    @JsonProperty("profile_use_background_image")
    public void setProfile_use_background_image(Boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }

    public User withProfile_use_background_image(Boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
        return this;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public User with_protected(Boolean _protected) {
        this._protected = _protected;
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

    public User withScreen_name(String screen_name) {
        this.screen_name = screen_name;
        return this;
    }

    @JsonProperty("statuses_count")
    public Long getStatuses_count() {
        return statuses_count;
    }

    @JsonProperty("statuses_count")
    public void setStatuses_count(Long statuses_count) {
        this.statuses_count = statuses_count;
    }

    public User withStatuses_count(Long statuses_count) {
        this.statuses_count = statuses_count;
        return this;
    }

    @JsonProperty("time_zone")
    public String getTime_zone() {
        return time_zone;
    }

    @JsonProperty("time_zone")
    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public User withTime_zone(String time_zone) {
        this.time_zone = time_zone;
        return this;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    public User withUrl(Object url) {
        this.url = url;
        return this;
    }

    @JsonProperty("utc_offset")
    public Long getUtc_offset() {
        return utc_offset;
    }

    @JsonProperty("utc_offset")
    public void setUtc_offset(Long utc_offset) {
        this.utc_offset = utc_offset;
    }

    public User withUtc_offset(Long utc_offset) {
        this.utc_offset = utc_offset;
        return this;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public User withVerified(Boolean verified) {
        this.verified = verified;
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
