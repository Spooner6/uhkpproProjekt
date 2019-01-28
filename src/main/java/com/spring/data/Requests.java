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

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE
                            ,CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "owner")
    private User user;


    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public User getUser() {
        return user;
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

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Requests{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", desctiption='" + desctiption + '\'' +
                ", user=" + user +
                '}';
    }

    public Requests(String text, String desctiption, User user) {
        this.text = text;
        this.desctiption = desctiption;
        this.user = user;
    }
    public Requests(){

    }
}
