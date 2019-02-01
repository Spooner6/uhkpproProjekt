package com.spring.service;

import com.spring.data.News;

import java.util.List;

public interface NewsService {
    public List<News> getNews();
    public void saveNews(News news);

    public  News getNews(int id);
    public void deleteNews(int id);
}
