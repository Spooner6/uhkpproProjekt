package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "login/plain-login";
    }
    @GetMapping("/accesDenied")
    public String showAccesDenied(){
        return "login/accesDenied";
    }

    public static void main(String[] args) {
        
    }
}
