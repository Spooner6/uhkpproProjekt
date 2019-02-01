package com.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceDao {
    public void recordArrive(String username);

    public void recordLeave();

}
