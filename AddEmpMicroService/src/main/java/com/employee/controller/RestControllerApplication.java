package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Create;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class RestControllerApplication 
{
	@Autowired
	EmployeeService empService;
	@PostMapping("/AddEmployee")
	public Create createAccount(@RequestBody Create emp) {
		return empService.createEmployee(emp);
	}
}