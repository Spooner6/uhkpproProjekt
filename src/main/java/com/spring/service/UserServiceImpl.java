package com.spring.service;

import com.spring.repository.UserDao;
import com.spring.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional
    public List<User> getUsers() {
        return (ArrayList<User>) userDao.findAll();
    }

    @Override
    @Transactional
    public void saveUser(User User) {
        userDao.save(User);
    }

    @Override
    @Transactional
    public User getUser(String userName) {
        return userDao.findOne(userName);
    }

    @Override
    @Transactional
    public void deleteUser(String userName) {
        userDao.delete(userName);
    }
}
