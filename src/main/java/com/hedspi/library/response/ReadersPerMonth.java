package com.hedspi.library.response;

public class ReadersPerMonth {
    private String month;
    private Long quantity;

    public ReadersPerMonth(String month, Long quantity) {
        this.month = month;
        this.quantity = quantity;
    }

    public ReadersPerMonth(){}

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
