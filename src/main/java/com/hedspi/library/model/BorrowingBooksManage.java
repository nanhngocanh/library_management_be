package com.hedspi.library.model;

import javax.persistence.*;

@Entity
@Table(name = "borrowing_books_manage")
public class BorrowingBooksManage {
    @Id
    @Column(name = "id")
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reader_id", nullable = false)
    private Reader reader;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "librarian_id", nullable = false)
    private Librarian librarian;

    @Column(name = "start")
    private java.sql.Timestamp start;

    @Column(name = "return_appointment")
    private java.sql.Date returnAppointment;

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Column(name = "return_date")


    private java.sql.Date returnDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public java.sql.Timestamp getStart() {
        return this.start;
    }

    public void setStart(java.sql.Timestamp start) {
        this.start = start;
    }

    public java.sql.Date getReturnAppointment() {
        return this.returnAppointment;
    }

    public void setReturnAppointment(java.sql.Date returnAppointment) {
        this.returnAppointment = returnAppointment;
    }

    public java.sql.Date getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(java.sql.Date returnDate) {
        this.returnDate = returnDate;
    }
}
