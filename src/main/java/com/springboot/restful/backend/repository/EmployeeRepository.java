package com.springboot.restful.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restful.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
