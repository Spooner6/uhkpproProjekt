package com.spring.dao;

import com.spring.data.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.hibernate.query.Query;
import java.util.List;

@Repository
public class NewsDaoImpl implements NewsDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<News> getNews() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<News> theQuery = currentSession.createQuery("from News ", News.class);

        List<News> news = theQuery.getResultList();
        return news;
    }

    @Override
    public void saveNews(News news) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(news);
    }

    @Override
    public News getNews(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        News news = currentSession.get(News.class, id);
        return news;
    }


}
