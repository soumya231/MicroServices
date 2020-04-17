package com.employee.dao;

import org.springframework.stereotype.Repository;

import com.employee.entity.Create;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeDao extends JpaRepository<Create, Integer>{

	
}
