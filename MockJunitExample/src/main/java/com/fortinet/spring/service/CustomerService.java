package com.fortinet.spring.service;

import java.util.List;

import com.fortinet.spring.entity.Customer;

public interface CustomerService {
	
	Customer add(Customer person);

	List<Customer> listCustomers();
}
