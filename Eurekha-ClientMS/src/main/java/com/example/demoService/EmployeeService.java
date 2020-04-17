package com.example.demoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoDao.EmployeeDao;
import com.example.demoEntity.Create;


@Service
public class EmployeeService {

	
	@Autowired
	EmployeeDao empDao;
	
	public Create createEmployee(Create emp) {
		
		return empDao.save(emp); 
	}
}
