package com.jdbcdao.spjdbcexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcdao.spjdbcexample.model.Employee;
import com.jdbcdao.spjdbcexample.serviceImpl.EmployeeDao;

@RestController
public class EmployeeController {
	
	@Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/getAllEmployees")
    public List<Employee> getEmployeeList(){
        return employeeDao.getAllEmployees();
    }

}
