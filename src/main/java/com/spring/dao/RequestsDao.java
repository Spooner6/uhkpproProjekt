package com.spring.dao;

import com.spring.data.Requests;

import java.util.List;

public interface RequestsDao {
    public List<Requests> getRequests();

    public void saveRequests(Requests requests);

    public Requests getRequests(int id);

    public void deleteRequests(int id);
}
