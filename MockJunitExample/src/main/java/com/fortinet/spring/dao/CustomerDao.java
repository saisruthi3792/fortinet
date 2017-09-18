package com.fortinet.spring.dao;

import java.util.List;

import com.fortinet.spring.entity.Customer;

public interface CustomerDao {

	List<Customer> listCustomers();

	Customer add(Customer customer);

}
