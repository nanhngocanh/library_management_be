package com.hedspi.library.response;

public class BookRating {
    private Integer bookId;
    private Long rating;

    public BookRating(Integer bookId, Long rating) {
        this.bookId = bookId;
        this.rating = rating;
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
