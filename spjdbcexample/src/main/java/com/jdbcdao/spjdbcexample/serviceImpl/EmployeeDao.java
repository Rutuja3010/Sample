package com.jdbcdao.spjdbcexample.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbcdao.spjdbcexample.model.Employee;
import com.jdbcdao.spjdbcexample.service.EmployeeRepository;

@Repository
public class EmployeeDao implements EmployeeRepository{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "select * from employee";
		List<Employee> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
		// TODO Auto-generated method stub
		return list;
	}

}

