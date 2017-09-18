package com.fortinet.spring.dao;

import java.util.List;

import com.fortinet.spring.entity.Customer;

public interface CustomerDao {
	
		   void add(Customer customer);
		   List<Customer> listCustomers();
		

}
