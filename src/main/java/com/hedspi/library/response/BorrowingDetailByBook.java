package com.hedspi.library.response;

import java.util.Date;

public class BorrowingDetailByBook {
    private Integer borrowingBookManagerId;
    private String readerName;
    private Integer quantity;
    private Date returnAppoiment;

    public BorrowingDetailByBook(Integer borrowingBookManagerId, String readerName, Integer quantity, Date returnAppoiment) {
        this.borrowingBookManagerId = borrowingBookManagerId;
        this.readerName = readerName;
        this.quantity = quantity;
        this.returnAppoiment = returnAppoiment;
    }

    public BorrowingDetailByBook(){}

    public Integer getBorrowingBookManagerId() {
        return borrowingBookManagerId;
    }

    public void setBorrowingBookManagerId(Integer borrowingBookManagerId) {
        this.borrowingBookManagerId = borrowingBookManagerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getReturnAppoiment() {
        return returnAppoiment;
    }

    public void setReturnAppoiment(Date returnAppoiment) {
        this.returnAppoiment = returnAppoiment;
    }
}
