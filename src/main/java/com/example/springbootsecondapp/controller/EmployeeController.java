package com.example.springbootsecondapp.controller;

import com.example.springbootsecondapp.model.Employee;
import com.example.springbootsecondapp.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping
    public Employee saveEmployee(Employee employee) {
        return employeeService.saveEmployee(employee);
    }

}
