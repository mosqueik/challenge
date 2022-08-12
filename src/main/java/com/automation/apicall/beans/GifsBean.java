package com.automation.apicall.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a DTO to manage the responses for a particular endpoint call
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GifsBean {

    protected String type;
    protected String id;
    protected String slug;
    protected String url;
    protected String bitly_url;
    protected String embed_url;
    protected String username;
    protected String source;
    protected String rating;
    protected String content_url;
    protected UserBean user;
    protected String source_tld;
    protected String source_post_url;
    protected String update_datetime;
    protected String create_datetime;
    protected String import_datetime;
    protected String trending_datetime;

    protected ImageBean images;
    protected String title;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBitly_url() {
        return bitly_url;
    }

    public void setBitly_url(String bitly_url) {
        this.bitly_url = bitly_url;
    }

    public String getEmbed_url() {
        return embed_url;
    }

    public void setEmbed_url(String embed_url) {
        this.embed_url = embed_url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getContent_url() {
        return content_url;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getSource_tld() {
        return source_tld;
    }

    public void setSource_tld(String source_tld) {
        this.source_tld = source_tld;
    }

    public String getSource_post_url() {
        return source_post_url;
    }

    public void setSource_post_url(String source_post_url) {
        this.source_post_url = source_post_url;
    }

    public String getUpdate_datetime() {
        return update_datetime;
    }

    public void setUpdate_datetime(String update_datetime) {
        this.update_datetime = update_datetime;
    }

    public String getCreate_datetime() {
        return create_datetime;
    }

    public void setCreate_datetime(String create_datetime) {
        this.create_datetime = create_datetime;
    }

    public String getImport_datetime() {
        return import_datetime;
    }

    public void setImport_datetime(String import_datetime) {
        this.import_datetime = import_datetime;
    }

    public String getTrending_datetime() {
        return trending_datetime;
    }

    public void setTrending_datetime(String trending_datetime) {
        this.trending_datetime = trending_datetime;
    }

    public ImageBean getImages() {
        return images;
    }

    public void setImages(ImageBean images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
