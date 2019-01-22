package com.spring.dao;

import com.spring.data.Authorities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AuthoritiesDao extends CrudRepository<Authorities, Long> {

    Authorities findByUsername(@Param("username") String userName);
}
