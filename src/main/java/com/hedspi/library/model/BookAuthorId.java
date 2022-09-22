package com.hedspi.library.model;

import java.io.Serializable;

public class BookAuthorId implements Serializable {
    private Integer bookId;
    private Integer authorId;

    public BookAuthorId(Integer bookId, Integer authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
    }

    public BookAuthorId() {

    }
}
