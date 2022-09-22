package com.hedspi.library.model;

import javax.persistence.*;

@Entity
@Table(name = "reader")
public class Reader {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "activation_date")
    private java.sql.Date activationDate;

    @Column(name = "exp_date")
    private java.sql.Date expDate;

    @Column(name = "type")
    private String type;

    @Column(name = "note")
    private String note;

    @Column(name = "deposit")
    private Integer deposit;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getActivationDate() {
        return this.activationDate;
    }

    public void setActivationDate(java.sql.Date activationDate) {
        this.activationDate = activationDate;
    }

    public java.sql.Date getExpDate() {
        return this.expDate;
    }

    public void setExpDate(java.sql.Date expDate) {
        this.expDate = expDate;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getDeposit() {
        return this.deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }
}
