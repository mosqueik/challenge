package com.automation.apicall.beans.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedDownSampledBean extends CommonBean {

    protected String webp;
    protected String webp_size;

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    public String getWebp_size() {
        return webp_size;
    }

    public void setWebp_size(String webp_size) {
        this.webp_size = webp_size;
    }
}
