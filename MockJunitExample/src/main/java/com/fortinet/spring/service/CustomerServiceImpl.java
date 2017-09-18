package com.fortinet.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fortinet.spring.dao.CustomerDao;
import com.fortinet.spring.entity.Customer;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao custDao;

	@Transactional
	@Override
	public Customer add(Customer customer) {
		custDao.add(customer);
		return customer;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Customer> listCustomers() {
		return custDao.listCustomers();
	}

	

}
