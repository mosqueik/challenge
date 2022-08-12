package com.automation.apicall.beans.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedBean extends CommonBean {

    protected String mp4_size;
    protected String mp4;
    protected String webp_size;
    protected String webp;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMp4_size() {
        return mp4_size;
    }

    public void setMp4_size(String mp4_size) {
        this.mp4_size = mp4_size;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public String getWebp_size() {
        return webp_size;
    }

    public void setWebp_size(String webp_size) {
        this.webp_size = webp_size;
    }

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }
}
