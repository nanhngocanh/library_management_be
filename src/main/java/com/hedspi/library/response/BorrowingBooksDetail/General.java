package com.hedspi.library.response.BorrowingBooksDetail;

import java.math.BigDecimal;
import java.util.Date;

public class General {
    private Integer id;
    private Integer readerId;
    private String readerName;
    private Date startBorrowing;
    private Date returnDueDate;
    private Date returnDate;
    private String librarianName;
    private Long quantity;
    private Long total;
    private BigDecimal forfeit;

    public General(Integer id, Integer readerId, String readerName, Date startBorrowing, Date returnDueDate, Date returnDate, String librarianName, Long quantity, Long total, BigDecimal forfeit) {
        this.id = id;
        this.readerId = readerId;
        this.readerName = readerName;
        this.startBorrowing = startBorrowing;
        this.returnDueDate = returnDueDate;
        this.returnDate = returnDate;
        this.librarianName = librarianName;
        this.quantity = quantity;
        this.total = total;
        this.forfeit = forfeit;
    }

    public General(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public Date getStartBorrowing() {
        return startBorrowing;
    }

    public void setStartBorrowing(Date startBorrowing) {
        this.startBorrowing = startBorrowing;
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

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public BigDecimal getForfeit() {
        return forfeit;
    }

    public void setForfeit(BigDecimal forfeit) {
        this.forfeit = forfeit;
    }
}
