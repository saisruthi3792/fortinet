package com.fortinet.spring.service;

import java.util.List;

import com.fortinet.spring.entity.Customer;

public interface CustomerService {
	
	 void add(Customer customer);
	 List<Customer> listCustomers();

}
	