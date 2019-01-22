package com.spring.dao;

import com.spring.data.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    //@Override
    @Transactional
    public List<User> getUser() {
        Session curreSession = sessionFactory.getCurrentSession();

        //vyladit ten dotaz/
        Query<User> theQuery = curreSession.createQuery("select c from User AS c", User.class);

        List<User> users = theQuery.getResultList();

        return users;
        //return null;
    }
}
