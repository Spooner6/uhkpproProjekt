package com.spring.dao;

import com.spring.data.Attendance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Transactional
@Repository
public class AttendanceDaoImpl implements AttendanceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Attendance> getAttendance() {
        return null;
    }

    @Override
    public void recordArrive(String username) {
        Session currentSession = sessionFactory.getCurrentSession();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println(timeStamp);

       // Attendance attendance = new Attendance(sdf.format(cal.getTime()),1,1);
        Attendance attendance= new Attendance();
        attendance.setPrichod(timeStamp);
        attendance.setUsername(username);
        attendance.setStav("Příchod");

        currentSession.saveOrUpdate(attendance);

    }

    @Override
    public void recordLeave(String username) {

        Session currentSession = sessionFactory.getCurrentSession();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());



        // Attendance attendance = new Attendance(sdf.format(cal.getTime()),1,1);
        Attendance attendance= new Attendance();
        attendance.setPrichod(timeStamp);
        attendance.setUsername(username);
        attendance.setStav("Odchod");

        //System.out.println(attendance);

        currentSession.saveOrUpdate(attendance);

    }
}
