package com.example.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.Model.Employee;
import com.example.EmployeeManagement.service.EmpService;



@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RestController("/api/v1")

public class EmpController {
	@Autowired
	private EmpService empService; 
	
	@PostMapping("/save")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empService.createEmp(emp),HttpStatus.CREATED); 
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllEmp(){
		return new ResponseEntity<List<Employee>>(empService.getAllEmp(),HttpStatus.OK); 
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmpId(@PathVariable int id ){
		return new ResponseEntity<Employee>(empService.getEmpbyId(id),HttpStatus.OK); 
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable int id){
		empService.deleteEmp(id); 
		return new ResponseEntity<String>("Delete Sucessfully", HttpStatus.OK); 
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee>updateEmp(@PathVariable int id, @RequestBody Employee emp ){
		return new ResponseEntity<Employee>(empService.updateEmp(id, emp),HttpStatus.OK); 
	}
}
