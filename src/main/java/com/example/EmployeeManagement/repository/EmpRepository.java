package com.example.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeManagement.Model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
}
