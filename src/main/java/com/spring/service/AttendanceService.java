package com.spring.service;


import com.spring.data.Attendance;

import java.util.List;

public interface AttendanceService {
    public List<Attendance> getAttendance();
    public void recordArrive(String username);

    public void recordLeave(String username);
}
