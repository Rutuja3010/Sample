package com.jdbcdao.spjdbcexample.service;
 
import com.jdbcdao.spjdbcexample.model.Employee;

import java.util.List;


public interface EmployeeRepository {
	
	List<Employee> getAllEmployees();

}
