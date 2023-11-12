package com.example.springbootsecondapp.controller;

import com.example.springbootsecondapp.model.Employee;
import com.example.springbootsecondapp.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping()
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);
    }

}
