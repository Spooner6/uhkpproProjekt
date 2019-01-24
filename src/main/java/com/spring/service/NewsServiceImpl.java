package com.spring.service;

import com.spring.dao.NewsDao;
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
        return newsDao.getNews();
    }
}
