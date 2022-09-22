package com.hedspi.library.request;

public class SupplierSearchRequest {
    private String searchContent;
    private Integer page;
    private Integer size;

    public SupplierSearchRequest(String searchContent, Integer page, Integer size) {
        this.searchContent = searchContent;
        this.page = page;
        this.size = size;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

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
