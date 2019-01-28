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

}
