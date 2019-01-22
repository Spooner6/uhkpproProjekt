package com.spring.data;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authorities {

    @Id
    private Long id;
    private String username;


}
