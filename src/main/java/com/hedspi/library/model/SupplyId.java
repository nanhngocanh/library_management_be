package com.hedspi.library.model;

import java.io.Serializable;
import java.sql.Date;

public class SupplyId implements Serializable {
    private Integer bookId;
    private String supplierId;
    private java.sql.Date supplyDate;

    public SupplyId(Integer bookId, String supplierId, Date supplyDate) {
        this.bookId = bookId;
        this.supplierId = supplierId;
        this.supplyDate = supplyDate;
    }
}
