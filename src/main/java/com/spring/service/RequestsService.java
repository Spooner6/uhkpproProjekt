package com.spring.service;

import com.spring.data.Requests;

import java.util.List;

public interface RequestsService {
    public List<Requests> getRequests();
    public void saveRequests(Requests requests);

    public  Requests getRequests(int id);
    public void deleteRequests(int id);

}
