package com.hedspi.library.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "reader_status")
public class ReaderStatus {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "STATUS", length = 9)
    private String status;

    public String getStatus() {
        return status;
    }

    public Integer getId() {
        return id;
    }

    protected ReaderStatus() {
    }
}