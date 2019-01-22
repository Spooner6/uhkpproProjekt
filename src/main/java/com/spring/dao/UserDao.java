package com.spring.dao;

import com.spring.data.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao  {

    public List<User> getUser();
}
