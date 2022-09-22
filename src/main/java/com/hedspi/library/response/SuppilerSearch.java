package com.hedspi.library.response;

public class SuppilerSearch {
    private String id;
    private String name;
    private String address;
    private Long bookQuantity;

    public SuppilerSearch() {
    }

    public SuppilerSearch(String id, String name, String address, Long bookQuantity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bookQuantity = bookQuantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(Long bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
