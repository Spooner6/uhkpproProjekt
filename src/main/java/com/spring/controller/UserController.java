package com.spring.controller;

import com.spring.dao.UserDao;
import com.spring.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    //vypis uzivatelu
    @GetMapping("/users")
    public String userList(Model model) {

        List<User> users = userDao.getUsers();
        model.addAttribute("users", users);
        return "employee-list";
    }
}