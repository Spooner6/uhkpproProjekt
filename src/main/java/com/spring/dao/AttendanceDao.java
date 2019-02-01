package com.spring.dao;

import com.spring.data.Attendance;

import java.util.List;

public interface AttendanceDao {
    public List<Attendance> getAttendance();
    public void recordArrive(String username);

    public void recordLeave(String username);

}
