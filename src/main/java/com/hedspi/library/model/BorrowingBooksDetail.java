package com.hedspi.library.model;

import javax.persistence.*;

@Entity
@Table(name = "borrowing_books_detail")
@IdClass(BorrowingBooksDetailId.class)
public class BorrowingBooksDetail {
    @Id
    @Column(name = "borrowing_books_id")
    private Integer borrowingBooksId;
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "borrowing_books_id", nullable = false)
    private BorrowingBooksManage borrowingBooksManage;

    @Id
    @Column(name = "book_id")
    private Integer bookId;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "returned")
    private Integer returned;

    @Column(name = "lost")
    private Integer lost;

    @Column(name = "damaged")
    private Integer damaged;

    @Column(name = "note")
    private String note;

    public BorrowingBooksManage getBorrowingBooksManage() {
        return borrowingBooksManage;
    }

    public void setBorrowingBooksManage(BorrowingBooksManage borrowingBooksManage) {
        this.borrowingBooksManage = borrowingBooksManage;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getBorrowingBooksId() {
        return this.borrowingBooksId;
    }

    public void setBorrowingBooksId(Integer borrowingBooksId) {
        this.borrowingBooksId = borrowingBooksId;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getReturned() {
        return this.returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public Integer getLost() {
        return this.lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getDamaged() {
        return this.damaged;
    }

    public void setDamaged(Integer damaged) {
        this.damaged = damaged;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

