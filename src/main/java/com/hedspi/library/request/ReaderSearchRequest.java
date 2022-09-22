package com.hedspi.library.request;

public class ReaderSearchRequest {
    private Integer id;
    private String keyword;
    private Integer page;
    private Integer size;

    public ReaderSearchRequest(Integer id, String keyword, Integer page, Integer size) {
        this.id = id;
        this.keyword = keyword;
        this.page = page;
        this.size = size;
    }

    public ReaderSearchRequest(){}

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
