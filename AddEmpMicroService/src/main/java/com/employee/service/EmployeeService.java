package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Create;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeDao empDao;
	
	public Create createEmployee(Create emp) {
		
		return empDao.save(emp); 
	}
}
