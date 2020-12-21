package com.spjpa.verinitespjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spjpa.verinitespjpa.model.Customer;
import com.spjpa.verinitespjpa.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/savecustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return "Customer saved";
	}

}
