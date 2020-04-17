package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Create;

@Service
public class EmployeeService implements EmployeeServiceI{

	
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public List<Create> findAllEmployees() {
	List<Create> emps=	empDao.findAll();
		return emps;
	}
}
