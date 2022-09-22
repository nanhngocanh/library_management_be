package com.hedspi.library.model;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Author(Integer id, String name, String note) {
        this.id = id;
        this.name = name;
        this.note = note;
    }

    public Author(){

    }

    @Column(name = "note")

    private String note;

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

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
