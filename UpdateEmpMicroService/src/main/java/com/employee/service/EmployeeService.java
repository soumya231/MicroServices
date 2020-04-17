package com.employee.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Create;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeDao empDao;
	
	public String updateEmployee(Create emp) {
		
		
			empDao.save(emp);
			return "Updated Successfully";
	
		
	}
}
