package com.example.EmployeeManagement.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.Model.Employee;
import com.example.EmployeeManagement.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepo; 
	
	@Override
	public Employee createEmp(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpbyId(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		Employee emp = empRepo.findById(id).get(); 
		if(emp!=null) {
			empRepo.delete(emp); 
		}
	}

	@Override
	public Employee updateEmp(int id, Employee emp) {
		// TODO Auto-generated method stub
		Employee oldEmp= empRepo.findById(id).get(); 
		if(oldEmp!=null	) {
			emp.setId(id);  
			return empRepo.save(emp); 
		}
		return null;
	}
  
	
	
}
