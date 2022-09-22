package com.hedspi.library.response.BorrowingBooksDetail;

public class Detail {
    private Integer bookId;
    private String bookName;
    private Integer retailPrice;
    private Integer quantity;
    private Integer returned;
    private Integer lost;
    private Integer damage;

    public Detail(Integer bookId, String bookName, Integer retailPrice, Integer quantity, Integer returned, Integer lost, Integer damage) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.retailPrice = retailPrice;
        this.quantity = quantity;
        this.returned = returned;
        this.lost = lost;
        this.damage = damage;
    }

    public Detail(){}

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
