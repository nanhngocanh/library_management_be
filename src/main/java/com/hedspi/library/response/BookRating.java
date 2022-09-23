package com.hedspi.library.response;

public class BookRating {
    private Integer bookId;
    private String name;
    private Long rating;

    public BookRating(Integer bookId, String name, Long rating) {
        this.bookId = bookId;
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookRating(Integer bookId) {
        this.bookId = bookId;
    }

    public BookRating(Long rating) {
        this.rating = rating;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}
