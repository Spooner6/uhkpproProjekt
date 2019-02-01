package com.spring.service;

import com.spring.repository.RequestsDao;
import com.spring.data.Requests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RequestsServiceImpl implements RequestsService{
    @Autowired
    private RequestsDao requestsDao;


    @Override
    @Transactional
    public List<Requests> getRequests() {
        return (List<Requests>) requestsDao.findAll();
    }

    @Override
    @Transactional
    public void saveRequests(Requests requests) {
    requestsDao.save(requests);
    }

    @Override
    @Transactional
    public Requests getRequests(int id) {
        return requestsDao.findOne(id);
    }

    @Override
    @Transactional
    public void deleteRequests(int id) {
    requestsDao.delete(id);
    }
}
