package com.hedspi.library.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "forfeit")
public class Forfeit {
    @Id
    @Column(name = "borrowing_books_id", nullable = false)
    private Integer borrowingBooksId;

    @Column(name = "total", precision = 47, scale = 2)
    private BigDecimal total;

    public BigDecimal getTotal() {
        return total;
    }

    public Integer getBorrowingBooksId() {
        return borrowingBooksId;
    }

    protected Forfeit() {
    }
}