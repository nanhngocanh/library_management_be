package com.hedspi.library.response;

import java.util.Date;

public class BorrowingBookManageResponse {
    private Integer id;
    private String readerName;
    private Date startDate;
    private Date returnDueDate;
    private Date returnedDate;
    private String librarianName;

    public BorrowingBookManageResponse(Integer id, String readerName, Date startDate, Date returnDueDate, Date returnedDate, String librarianName) {
        this.id = id;
        this.readerName = readerName;
        this.startDate = startDate;
        this.returnDueDate = returnDueDate;
        this.returnedDate = returnedDate;
        this.librarianName = librarianName;
    }

    public BorrowingBookManageResponse(){}

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getReturnDueDate() {
        return returnDueDate;
    }

    public void setReturnDueDate(Date returnDueDate) {
        this.returnDueDate = returnDueDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }
}
