package com.spring.controller;

import com.spring.data.News;
import com.spring.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    //vypis novinek
    @GetMapping("/novinky")
    public String listNews(Model theModel){
        //bere novinky z service
        List<News> theNews = newsService.getNews();

        theModel.addAttribute("news",theNews);
        return "news";
    }
    //pridani novinky
    @GetMapping("/showFormForAdd")
    public  String addNews(Model model){

        News news = new News();
        model.addAttribute("news", news);
            return "customizeNews";
    }

    @PostMapping("/saveNews")
    public String saveNews(@ModelAttribute("news") News news){

        newsService.saveNews(news);
        //redirect: zpet na list novinek?
        return "redirect:/novinky";
    }

    @GetMapping("/updateNews")
    public String updateNews(@RequestParam("newsId") int id, Model model){
        News news = newsService.getNews(id);

        model.addAttribute("news", news);

        return "customizeNews";
    }

}
