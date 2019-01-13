package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }
    /*@RequestMapping(method = RequestMethod.GET)
        public String sayHello(ModelMap model) {
            model.addAttribute("greeting", "Hello World from Spring 4 MVC");
            return "home";
        }
        */

      /*  @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
        public String sayHelloAgain(ModelMap model) {
            model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
            return "home";
        }
        */
    }

