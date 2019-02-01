package com.spring.service;

import com.spring.data.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public void saveUser(User user);

    public  User getUser(int id);
    public void deleteUser(int id);
}
