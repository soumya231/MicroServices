package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Create;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeDao empDao;
	
	public Optional<Create> findEmployee(Integer empId) {

		return empDao.findById(empId);
	}
}
