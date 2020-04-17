package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;


@Service
public class EmployeeService implements EmployeeServiceI {

	
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public String deleteEmpById(Integer eId) {
		
			 empDao.deleteById(eId);
			return "deleted employee";
	}


}
