package com.hedspi.library.response;

public class BorrowingPerMonth {
    private String month;
    private Long quantity;

    public BorrowingPerMonth(){}

    public BorrowingPerMonth(String month, Long quantity) {
        this.month = month;
        this.quantity = quantity;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
