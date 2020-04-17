package com.example.demoDao;

import org.springframework.stereotype.Repository;

import com.example.demoEntity.Create;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeDao extends JpaRepository<Create, Integer>{

	
}
