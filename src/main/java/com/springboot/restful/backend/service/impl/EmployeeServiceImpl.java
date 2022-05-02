package com.springboot.restful.backend.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.restful.backend.model.Employee;
import com.springboot.restful.backend.repository.EmployeeRepository;
import com.springboot.restful.backend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	}

