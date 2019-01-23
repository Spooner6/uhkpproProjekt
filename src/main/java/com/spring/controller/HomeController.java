package com.spring.controller;

import com.spring.dao.NewsDao;
import com.spring.dao.UserDao;
import com.spring.data.News;
import com.spring.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
//@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private NewsDao newsDao;

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }

    @GetMapping("/users")
    public String userList(Model model) {

        List<User> users = userDao.getUsers();
        model.addAttribute("users", users);
        return "employee-list";
    }

    @GetMapping("/novinky")
    public String listNews(Model theModel){
        List<News> theNews =newsDao.getNews();

        theModel.addAttribute("news",theNews);
        return "news";
    }
}

