package com.spring.data;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
public class Authorities {

    private String username;
    private EnumAuthorities authority;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "authority")
    public EnumAuthorities getAuthority() {
        return authority;
    }

    public void setAuthority(EnumAuthorities authority) {
        this.authority = authority;
    }

    public Authorities(String username, EnumAuthorities authority) {
        this.username = username;
        this.authority = authority;
    }
    public Authorities(){

    }
}

