package com.employee.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.Create;
import com.employee.service.EmployeeService;

@RestController

public class RestControllerApplication 
{
	@Autowired
	RestTemplate rest;
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/update/employee")
	public String updateEmp(@RequestBody Create emp) {
		
		Create employee=rest.getForObject("http://localhost:8011/employee/findById/"+emp.getEmpId(), Create.class);

		if(employee != null){
	employee.setEmpId(emp.getEmpId());
	employee.setEmpName(emp.getEmpName());
	employee.setSalary(emp.getSalary());
		return empService.updateEmployee(employee);
		}
		else{
			return "Id not exist";
		}
	}
}