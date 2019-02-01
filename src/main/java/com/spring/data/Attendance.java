package com.spring.data;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;


@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @NotNull
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "prichod")
    private String prichod;
    //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Column(name = "stav", length = 50)
    private String stav;

    @Column(name = "username")
    private String username;

    public Attendance(int id, String prichod, String stav, String username) {
        this.id = id;
        this.prichod = prichod;
        this.stav = stav;
        this.username = username;
    }

    public Attendance() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrichod() {
        return prichod;
    }

    public void setPrichod(String prichod) {
        this.prichod = prichod;
    }

    public String getStav() {
        return stav;
    }

    public void setStav(String stav) {
        this.stav = stav;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
