package com.example.springbootsecondapp.service.impl;

import com.example.springbootsecondapp.model.Employee;
import com.example.springbootsecondapp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
