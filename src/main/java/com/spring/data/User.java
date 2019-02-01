package com.spring.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.List;

@Entity
@Table(name = "users")
public class User {


    @Id
    @NotNull
    private String userName;
    @NotNull
    private String password;
    @NotNull
    private String enabled;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String adress;
    @NotNull
    private String cardNumber;


    public User(){

    }
    @OneToMany
    @JoinColumn(name = "username")
     private List<Authorities> authorities;

    @NotNull
    @Column(name = "username", nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @NotNull
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    @Column(name = "enabled", nullable = false)
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }


    @NotNull
    @Column(name = "firstname", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    @Column(name = "lastname", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @NotNull
    @Column(name = "adress", nullable = false)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @NotNull
    @Column(name = "cardnumber", nullable = false)
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
