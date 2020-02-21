package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();

	public Employee getEmployee(int theId);

	public Employee addEmployee(Employee theEmployee);
	
	public Employee updateEmployee(Employee theEmployee);

	public void deleteEmployee(int theId);

}
