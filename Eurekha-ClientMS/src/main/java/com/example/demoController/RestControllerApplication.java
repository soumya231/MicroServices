package com.example.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoEntity.Create;
import com.example.demoService.EmployeeService;


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