package com.spring.data;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @NotNull
    @Column(name ="text")
    String text;
    @NotNull
    @Column(name = "description")
    String description;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public News(int id, String text, String description) {
        this.id = id;
        this.text = text;
        this.description = description;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public News() {
    }
}
