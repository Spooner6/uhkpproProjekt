package com.spring.data;

import javax.persistence.*;

@Entity
@Table(name = "requests")
public class Requests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "text")
    private String text;
    @Column(name = "description")
    private String desctiption;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getDesctiption() {
        return desctiption;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }


    @Override
    public String toString() {
        return "Requests{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", desctiption='" + desctiption + '\'' +
                '}';
    }

    public Requests(String text, String desctiption) {
        this.text = text;
        this.desctiption = desctiption;
    }

    public Requests(){

    }
}
