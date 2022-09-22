package com.hedspi.library.request;

public class BorrowingBookManageSearch {
    private Integer id;
    private String readerName;
    private Integer page;
    private Integer size;

    public BorrowingBookManageSearch(Integer id, String readerName, Integer page, Integer size) {
        this.id = id;
        this.readerName = readerName;
        this.page = page;
        this.size = size;
    }

    public BorrowingBookManageSearch(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
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
