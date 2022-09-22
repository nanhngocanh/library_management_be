package com.hedspi.library.request;

public class PageSize {
    private Integer page;
    private Integer size;

    public PageSize(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public PageSize(){}

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
