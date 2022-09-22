package com.hedspi.library.response;

import java.util.Date;

public class ReaderBorrowingBook {
    private Integer id;
    private Date start;
    private Date returnDueDate;
    private Date returnDate;

    public ReaderBorrowingBook(Integer id, Date start, Date returnDueDate, Date returnDate) {
        this.id = id;
        this.start = start;
        this.returnDueDate = returnDueDate;
        this.returnDate = returnDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getReturnDueDate() {
        return returnDueDate;
    }

    public void setReturnDueDate(Date returnDueDate) {
        this.returnDueDate = returnDueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
