package com.spring.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Roles {
    @Id
    @GeneratedValue
    private int id;
    private String autorization;
   //mapped by... neni s nicim propojene.
    //CascadeType: kdyz smazeme roli, tak to nesmaze uzivatele
    @OneToMany(mappedBy = "roles", cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                                                CascadeType.DETACH, CascadeType.REFRESH})
    public List<Employee> employeeList;

    public Roles(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutorization() {
        return autorization;
    }

    public void setAutorization(String autorization) {
        this.autorization = autorization;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Roles(String autorization, List<Employee> employeeList) {
        this.autorization = autorization;
        this.employeeList = employeeList;
    }

    public void add(Employee tempEmployee){
        if (employeeList == null){
            employeeList = new ArrayList<Employee>();
        }
        employeeList.add(tempEmployee);

        tempEmployee.setRoles(this);
    }


}
