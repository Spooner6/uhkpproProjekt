package com.spring.controller;

import com.spring.data.User;
import com.spring.dto.UserDto;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //vypis uzivatelu
 /*   @GetMapping("/users")
    public String userList(Model model) {

        List<UserDto> userDtos = userService.getUsers();
        model.addAttribute("users", userDtos);
        return "employee/employee-list";
    }
    */
 /* @GetMapping("/addUser")
    public String addUser(Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("users",userDto);
        return "employee/updateEmployee-list";
    }
    */
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("users") User user) {
        userService.saveUser(user);
        return "redirect:/employee-list";
    }

    @GetMapping("/updateUser")
    public String updateUser(@RequestParam("userId") String userName, Model model) {
        User user = userService.getUser(userName);
        model.addAttribute("users", user);
        return "employee/updateEmployee-list";
    }

    @GetMapping("/deleteUser")
    public String deleUser(@RequestParam("userId") String userName) {
        userService.deleteUser(userName);
        return "redirect:/employee-list";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String userList(Model mode, @ModelAttribute UserDto dto) {
        mode.addAttribute("users", userService.getUsers());
        mode.addAttribute("userDto", new UserDto());
        mode.addAttribute("isEditOp", false);


        return "employee/employee-list";
    }

}