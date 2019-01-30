package com.spring.controller;

import com.spring.data.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //vypis uzivatelu
    @GetMapping("/users")
    public String userList(Model model) {

        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "employee/employee-list";
    }
  @GetMapping("/addUser")
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("users",user);
        return "employee/updateEmployee-list";
    }
     @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("users") User user){
        userService.saveUser(user);
        return "redirect:/employee-list";
    }
     @GetMapping("/updateUser")
    public String updateUser(@RequestParam("userId") int id, Model model){
        User user = userService.getUser(id);
        model.addAttribute("users", user);
        return "employee/updateEmployee-list";
    }
    @GetMapping("/deleteUser")
    public String deleUser(@RequestParam("userId") int id){
        userService.deleteUser(id);
        return "redirect:/employee-list";
    }
}
