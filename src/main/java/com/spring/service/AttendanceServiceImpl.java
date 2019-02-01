package com.spring.service;

import com.spring.dao.AttendanceDao;
import com.spring.data.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public List<Attendance> getAttendance() {
        return attendanceDao.getAttendance();
    }

    @Override
    public void recordArrive(String username) {
        attendanceDao.recordArrive(username);
    }

    @Override
    public void recordLeave(String username) {
        attendanceDao.recordLeave(username);
    }
}
