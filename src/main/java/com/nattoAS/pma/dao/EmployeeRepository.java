package com.nattoAS.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nattoAS.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	public List<Employee> findAll();
}
