package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller

public class HomeController {

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

