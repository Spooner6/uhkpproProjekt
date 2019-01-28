package com.spring.dao;

import com.spring.data.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import org.hibernate.query.Query;
import java.util.List;

@Repository
public class NewsDaoImpl implements NewsDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<News> getNews() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<News> theQuery = currentSession.createQuery("from News", News.class);

        List<News> news = theQuery.getResultList();
        return news;
    }
    //ulozeni i update!!!
    @Override
    public void saveNews(News news) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(news);
    }

    @Override
    public News getNews(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        News news = currentSession.get(News.class, id);
        return news;
    }

    @Override
    public void deleteNews(int id) {
        Session currSession = sessionFactory.getCurrentSession();
        Query theQuery = currSession.createQuery("delete from News where id=:newsId");
        theQuery.setParameter("newsId", id);
        theQuery.executeUpdate();
    }


}
