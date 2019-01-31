package com.spring.controller;

import com.spring.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller

public class HomeController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/")
    public String showHome() {
        return "home/home";
    }

    @GetMapping("/prichod")
    public String recordArrive() {

       /* attendanceService.saveRequests();

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );*/

       attendanceService.recordArrive();

        return "home/home";
    }

    @GetMapping("/odchod")
    public String recordLeave() {

        return "home/home";
    }

    @GetMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }




}

