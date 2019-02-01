package com.spring.service;

import com.spring.data.User;

public interface UserService {
    public Iterable<User> getUsers();
    public void saveUser(User user);

    public  User getUser(String userName);
    public void deleteUser(String userName);
}
