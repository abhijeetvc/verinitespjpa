package com.spjpa.verinitespjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spjpa.verinitespjpa.model.Department;
import com.spjpa.verinitespjpa.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@PostMapping("/savedept")
	public String saveDepartment(@RequestBody Department department) {
		departmentRepository.save(department);
		return "Department saved";
	}
}
