package com.automation.apicall.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;

/**
 * This is a DTO to manage the responses for a particular endpoint call
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchBean {

    protected Collection<GifsBean> data;
    protected PaginationBean pagination;
    protected MetaBean meta;

    public Collection<GifsBean> getData() {
        return data;
    }

    public void setData(Collection<GifsBean> data) {
        this.data = data;
    }

    public PaginationBean getPagination() {
        return pagination;
    }

    public void setPagination(PaginationBean pagination) {
        this.pagination = pagination;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }
}
