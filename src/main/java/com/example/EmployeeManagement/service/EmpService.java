package com.example.EmployeeManagement.service;

import java.util.List;

import com.example.EmployeeManagement.Model.Employee;


public interface EmpService {
  public Employee createEmp(Employee emp); 
  public List<Employee> getAllEmp(); 
  public Employee getEmpbyId(int id); 
  public void deleteEmp(int id );
  public Employee updateEmp(int id, Employee emp);
  
  
}
