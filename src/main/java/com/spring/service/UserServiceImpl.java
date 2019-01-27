package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional
    public void saveUser(User User) {
        UserDao.saveUser(User);
    }

    @Override
    @Transactional
    public User getUser(int id) {


        return UserDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        UserDao.deleteUser(id);
    }
}
