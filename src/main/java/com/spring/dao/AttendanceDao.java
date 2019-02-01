package com.spring.dao;

public interface AttendanceDao {
    public void recordArrive(String username);

    public void recordLeave(String username);

}
