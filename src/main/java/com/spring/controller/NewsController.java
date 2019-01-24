package com.spring.controller;

import com.spring.dao.NewsDao;
import com.spring.data.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsDao newsDao;

    //vypis novinek
    @GetMapping("/novinky")
    public String listNews(Model theModel){
        List<News> theNews =newsDao.getNews();

        theModel.addAttribute("news",theNews);
        return "news";
    }

}
