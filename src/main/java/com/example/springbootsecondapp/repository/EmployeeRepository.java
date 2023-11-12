package com.example.springbootsecondapp.repository;

import com.example.springbootsecondapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
