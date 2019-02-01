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
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getUsers(){
        Session currentSession = sessionFactory.getCurrentSession();

        Query<User> theQuery = currentSession.createQuery("from User ",User.class);

        List<User> users = theQuery.getResultList();
        return users;

    }

    @Override
    public void saveUser(User User) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(User);
    }

    @Override
    public User getUser(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        User User = currentSession.get(User.class, id);
        return User;
    }

    @Override
    public void deleteUser(int id) {
        Session currSession = sessionFactory.getCurrentSession();
        Query theQuery = currSession.createQuery("delete from User where id=:UserId");
        theQuery.setParameter("UserId", id);
        theQuery.executeUpdate();
    }
}
