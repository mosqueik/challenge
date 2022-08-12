package com.automation.apicall.beans.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OriginalBean {

    protected String height;
    protected String width;
    protected String size;
    protected String url;
    protected String mp4_size;
    protected String mp4;
    protected String webp_size;
    protected String webp;
    protected String frames;
    protected String hash;


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

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

    public String getFrames() {
        return frames;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
