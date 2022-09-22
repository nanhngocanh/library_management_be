package com.hedspi.library.model;

import java.io.Serializable;

public class BorrowingBooksDetailId implements Serializable {
    private Integer borrowingBooksId;
    private Integer bookId;

    public BorrowingBooksDetailId(Integer borrowingBooksId, Integer bookId) {
        this.borrowingBooksId = borrowingBooksId;
        this.bookId = bookId;
    }
}
