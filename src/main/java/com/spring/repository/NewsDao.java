package com.spring.repository;

import com.spring.data.News;
import org.springframework.data.repository.CrudRepository;


public interface NewsDao extends CrudRepository<News, Integer> {
}
