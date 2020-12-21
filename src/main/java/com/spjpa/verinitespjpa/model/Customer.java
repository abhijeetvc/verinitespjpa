package com.spjpa.verinitespjpa.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String city;
	
	@ManyToMany
	@JoinTable(name="customer_product",
			joinColumns = @JoinColumn(name="cust_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="prod_id",referencedColumnName = "id"))
	private Set<Product> productSet;
}
