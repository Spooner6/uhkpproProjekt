package com.spring.service;

import com.spring.repository.NewsDao;
import com.spring.data.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Transactional
    public List<News> getNews() {
        return (List<News>) newsDao.findAll();
    }

    @Override
    @Transactional
    public void saveNews(News news) {
        newsDao.save(news);
    }

    @Override
    @Transactional
    public News getNews(int id) {


        return newsDao.findOne(id);
    }
    @Override
    @Transactional
    public void deleteNews(int id) {
        newsDao.delete(id);
    }

}
