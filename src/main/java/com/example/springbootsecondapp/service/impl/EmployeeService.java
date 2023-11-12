package com.example.springbootsecondapp.service.impl;

import com.example.springbootsecondapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();

}
