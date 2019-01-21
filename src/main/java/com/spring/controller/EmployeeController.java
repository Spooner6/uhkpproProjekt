package com.spring.controller;

import com.spring.dao.EmployeeDao;
import com.spring.data.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;


    @GetMapping("/list")
    //public String listEmployees(){
    public String listEmployees(Model model){

        List<Employee> theEmployees = employeeDao.getEmployees();

        model.addAttribute("employees", theEmployees);
        return "employee-list";
    }
}
