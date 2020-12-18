package com.spjpa.verinitespjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spjpa.verinitespjpa.model.Employee;
import com.spjpa.verinitespjpa.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "EMployee saved";
	}
	
	@GetMapping("/getemployeedata")
	public List<Employee> getEmployeeList(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/getemployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id) {
		return employeeRepository.findById(id);
	}
	
	@GetMapping("/getemployeedata1/{firstName}/{lastName}")
	public List<Employee> getEmployeeList1(@PathVariable String firstName,
										   @PathVariable String lastName){
		return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		Optional<Employee> emp=employeeRepository.findById(employee.getId());
		emp.get().setFirstName(employee.getFirstName());
		emp.get().setLastName(employee.getLastName());
		
		employeeRepository.save(emp.get());
		return "Employee Updated";
	}

}
