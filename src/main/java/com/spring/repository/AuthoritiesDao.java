package com.spring.repository;

import com.spring.data.Authorities;
import org.springframework.data.repository.CrudRepository;

public interface AuthoritiesDao extends CrudRepository<Authorities, String> {
}
