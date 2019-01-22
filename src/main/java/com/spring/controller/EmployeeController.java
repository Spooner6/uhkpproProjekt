package com.spring.controller;

import com.spring.dao.UserDao;
import com.spring.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private UserDao userDao;


    @GetMapping("/list")
    //public String listUsers(){
    public String listUsers(Model model){

        List<User> theUsers = userDao.getUser();

        model.addAttribute("users", theUsers);
        return "employee-list";
    }
}
