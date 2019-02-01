package com.spring.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authorities {



    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "authority")
    private String authority;

    public Authorities(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    public Authorities() {
    }

    public String getAuthority() {
        return authority;
    }

    public String getUsername() {
        return username;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

