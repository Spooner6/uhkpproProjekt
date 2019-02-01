package com.spring.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.List;

@Entity
@Table(name = "users")
@SecondaryTable(name = "authorities", pkJoinColumns = @PrimaryKeyJoinColumn(name = "username"))
public class User {

/*    @NotNull
    @Id
    @Column(name = "id")*/
   // private int id;
    @Id
    @NotNull
    @Column(name = "username")
    private String userName;
    @NotNull
    @Column(name = "password")
    private String password;
    @NotNull
    @Column(name = "enabled")
    private String enabled;
/*    @NotNull
    @Column(name = "role")
    private String role;*/
    @NotNull
    @Column(name = "firstname")
    private String firstName;
    @NotNull
    @Column(name = "lastname")
    private String lastName;
    @NotNull
    @Column(name = "adress")
    private String adress;
    @NotNull
    @Column(name = "cardnumber")
    private String cardNumber;
 /*   @NotNull
    @Column(table = "authorities", name = "username")
    private String username;
    */
    @NotNull
    @Column(table = "authorities", name = "authority")
    private String authority;


   /* @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST, CascadeType.MERGE
                                            ,CascadeType.DETACH, CascadeType.REFRESH})
    private List<Requests> requestsList;*/

  /*  @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "")
    private List<Authorities> authorities;
    */
    public User(){

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
    /*   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/
/*
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public User(String userName, String password, String enabled, String role, String firstName, String lastName,
                String adress, String cardNumber) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
 /*       this.role = role;*/
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "User{" +
    /*            "id=" + id +*/
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", enabled='" + enabled + '\'' +
         /*       ", role='" + role + '\'' +*/
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
