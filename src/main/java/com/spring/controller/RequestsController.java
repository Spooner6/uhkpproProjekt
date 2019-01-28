package com.spring.controller;

import com.spring.data.Requests;
import com.spring.service.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RequestsController {
    @Autowired
    RequestsService requestsService;

@GetMapping("/requests")
    public String getRequestsList(Model model){
    List<Requests> requests = requestsService.getRequests();
    model.addAttribute("requests", requests);

    return "requests/requests";
}

    @GetMapping("/addRequests")
    public  String addRequests(Model model){

        Requests requests = new Requests();
        model.addAttribute("requests", requests);
        return "requests/updateRequests";
    }

    @PostMapping("/saveRequests")
    public String saveRequests(@ModelAttribute("requests") Requests requests){

        requestsService.saveRequests(requests);

        return "redirect:/requests";
    }

    @GetMapping("/updateRequests")
    public String updateNews(@RequestParam("requestsId") int id, Model model){
        Requests requests = requestsService.getRequests(id);

        model.addAttribute("requests", requests);

        return "requests/updateRequests";
    }
    @GetMapping("/deleteRequests")
    public String deleteRequests(@RequestParam("requestsId")int id){
        requestsService.deleteRequests(id);
        return "redirect:/requests";
    }
}
