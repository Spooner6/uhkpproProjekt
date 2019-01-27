package com.spring.dao;

import com.spring.data.User;


import java.util.List;

public interface UserDao {
    public List<User> getUsers();

    public void saveUser(User User);

    public User getUser(int id);

    public void deleteUser(int id);
}
