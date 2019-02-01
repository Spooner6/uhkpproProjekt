package com.spring.service;

import com.spring.dao.RequestsDao;
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
        return requestsDao.getRequests();
    }

    @Override
    @Transactional
    public void saveRequests(Requests requests) {
    requestsDao.saveRequests(requests);
    }

    @Override
    @Transactional
    public Requests getRequests(int id) {
        return requestsDao.getRequests(id);
    }

    @Override
    @Transactional
    public void deleteRequests(int id) {
    requestsDao.deleteRequests(id);
    }
}
