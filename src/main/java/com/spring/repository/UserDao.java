package com.spring.repository;

import com.spring.data.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
public interface UserDao extends CrudRepository<User, String> {


}
