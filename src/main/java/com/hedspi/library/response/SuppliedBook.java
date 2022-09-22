package com.hedspi.library.response;



import java.time.LocalDate;
import java.util.Date;

public class SuppliedBook {
    private Integer bookId;
    private String bookName;
    private LocalDate supplyDate;
    private Integer quantity;
    private Integer importCost;

    public SuppliedBook(Integer bookId, String bookName, LocalDate supplyDate, Integer quantity, Integer importCost) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.supplyDate = supplyDate;
        this.quantity = quantity;
        this.importCost = importCost;
    }

    public SuppliedBook(){}

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

    public LocalDate getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(LocalDate supplyDate) {
        this.supplyDate = supplyDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getImportCost() {
        return importCost;
    }

    public void setImportCost(Integer importCost) {
        this.importCost = importCost;
    }
}
