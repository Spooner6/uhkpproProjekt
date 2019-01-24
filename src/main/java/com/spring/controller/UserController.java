package com.spring.controller;

import com.spring.data.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //vypis uzivatelu
    @GetMapping("/users")
    public String userList(Model model) {

        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "employee-list";
    }
}
