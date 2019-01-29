package com.spring.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    //@Id
    //@GeneratedValue
  //  private int id;
   // @NotNull
   // private String firstName;
   // @NotNull
   // private String lastName;
    @NotNull
    @Id
    @Column(name = "username")
    private String userName;
    //@NotNull
    //private String email;
    //@NotNull
    //private int telNumber;
    @NotNull
    @Column(name = "password")
    private String password;
    @NotNull
    @Column(name = "enabled")
    private String enabled;
    @NotNull
    @Column(name = "role")
    private String role;


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
/*

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

*/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   /* public User(String firstName, String lastName, String userName, String email, int telNumber, String password, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.telNumber = telNumber;
        this.password = password;
        this.role = role;
    }*/

    public User(String userName, String password, String enabled) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    /*   @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", telNumber=" + telNumber +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }*/
}
