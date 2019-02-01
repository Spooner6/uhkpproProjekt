package com.spring.dao;

import com.spring.data.Requests;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hibernate.query.Query;
import java.util.List;

@Repository
public class RequestsDaoImpl implements RequestsDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Requests> getRequests() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Requests> theQuery = currentSession.createQuery("from Requests", Requests.class);

        List<Requests> requests = theQuery.getResultList();

        return requests;
    }

    @Override
    public void saveRequests(Requests requests) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(requests);
    }

    @Override
    public Requests getRequests(int id) {

    Session currentSession = sessionFactory.getCurrentSession();

    Requests requests = currentSession.get(Requests.class, id);
        return requests;
}
    @Override
    public void deleteRequests(int id) {
        Session currSession = sessionFactory.getCurrentSession();
        Query theQuery = currSession.createQuery("delete from Requests where id=:requestsId");
        theQuery.setParameter("requestsId", id);
        theQuery.executeUpdate();

    }
}
