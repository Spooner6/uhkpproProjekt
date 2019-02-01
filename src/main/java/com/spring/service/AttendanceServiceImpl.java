package com.spring.service;

import com.spring.dao.AttendanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public void recordArrive(String username) {
        attendanceDao.recordArrive(username);
    }

    @Override
    public void recordLeave() {
        attendanceDao.recordLeave();
    }
}
