package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.Create;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class RestControllerApplication 
{
	@Autowired
	RestTemplate rest;
	
	@Autowired
	EmployeeService empService;
	
	@DeleteMapping("/delete/{empId}")
	public String deleteEmp(@PathVariable Integer empId) {
		Create employee=rest.getForObject("http://localhost:8011/employee/findById/"+empId, Create.class);

		if(employee != null){
	
		return empService.deleteEmpById(employee.getEmpId());
		}
		else{
			return "Id not found";
		}
	}
}