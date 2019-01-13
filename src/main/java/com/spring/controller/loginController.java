package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "loginPage";
    }
    @GetMapping("/accesDenied")
    public String showAccesDenied(){
        return "accesDenied";
    }
}
