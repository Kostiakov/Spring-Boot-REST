package com.luv2code.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);
		Employee theEmployee=null;
		if(result.isPresent()) {
			theEmployee=result.get();
		}
		else {
			throw new RuntimeException("Did not find Employee id " + theId);
		}
		return theEmployee;
	}

	@Override
	public Employee addEmployee(Employee theEmployee) {
		return employeeRepository.save(theEmployee);
	}

	@Override
	public Employee updateEmployee(Employee theEmployee) {
		return employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteEmployee(int theId) {
		employeeRepository.deleteById(theId);
	}

}
