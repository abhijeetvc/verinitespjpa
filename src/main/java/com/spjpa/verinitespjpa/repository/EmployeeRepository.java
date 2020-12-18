package com.spjpa.verinitespjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spjpa.verinitespjpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
		
	List<Employee> findByFirstNameAndLastName(String firstName,String lastName);
}
