package com.spring.controller;

import com.spring.data.Attendance;
import com.spring.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;


@Controller

public class HomeController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/")
    public String showHome(Model theModel) {
        List<Attendance> attendanceList = attendanceService.getAttendance();
        theModel.addAttribute("attendance",attendanceList);
        return "home/home";
    }

    @GetMapping("/prichod")
    public String recordArrive(Principal principal, Model theModel) {
        String userName=principal.getName(); // username or email using user login
        attendanceService.recordArrive(userName);

        List<Attendance> attendanceList = attendanceService.getAttendance();
        theModel.addAttribute("attendance",attendanceList);

        return "home/home";
    }

    @GetMapping("/odchod")
    public String recordLeave(Principal principal, Model theModel) {
        String userName=principal.getName(); // username or email using user login
        attendanceService.recordLeave(userName);

        List<Attendance> attendanceList = attendanceService.getAttendance();
        theModel.addAttribute("attendance",attendanceList);

        return "home/home";
    }

    @GetMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }




}

