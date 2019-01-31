package com.spring.data;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @NotNull
    @Column(name = "prichod")
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Column(name = "stav")
    int stav;

    @Column(name = "id_user")
    private int id_user;

    public Attendance(SimpleDateFormat sdf, int stav, int id_user) {
        this.sdf = sdf;
        this.stav = stav;
        this.id_user = id_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public int getStav() {
        return stav;
    }

    public void setStav(int stav) {
        this.stav = stav;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
