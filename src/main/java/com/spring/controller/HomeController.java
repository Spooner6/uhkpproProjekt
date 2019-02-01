package com.spring.controller;

import com.spring.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Controller

public class HomeController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/")
    public String showHome() {
        return "home/home";
    }

    @GetMapping("/prichod")
    public String recordArrive(Principal principal) {
        String userName=principal.getName(); // username or email using user login
        attendanceService.recordArrive(userName);

        return "home/home";
    }

    @GetMapping("/odchod")
    public String recordLeave(Principal principal) {
        String userName=principal.getName(); // username or email using user login
        attendanceService.recordLeave(userName);
        return "home/home";
    }

    @GetMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }




}

