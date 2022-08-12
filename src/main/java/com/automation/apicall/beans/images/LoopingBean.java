package com.automation.apicall.beans.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoopingBean {

    protected String mp4_size;
    protected String mp4;

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
}
