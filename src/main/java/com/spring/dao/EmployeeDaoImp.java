package com.spring.dao;

import com.spring.data.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    //@Override
    @Transactional
    public List<Employee> getEmployees() {
        Session curreSession = sessionFactory.getCurrentSession();

        //vyladit ten dotaz/
        Query<Employee> theQuery = curreSession.createQuery("select c from Employee AS c",Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
        //return null;
    }
}
