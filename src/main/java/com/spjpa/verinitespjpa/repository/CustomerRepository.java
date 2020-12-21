package com.spjpa.verinitespjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spjpa.verinitespjpa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
