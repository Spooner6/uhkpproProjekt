package com.spring.repository;

import com.spring.data.Requests;
import org.springframework.data.repository.CrudRepository;

public interface RequestsDao extends CrudRepository<Requests, Integer> {
}
