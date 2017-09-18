package com.fortinet.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fortinet.spring.dao.CustomerDao;
import com.fortinet.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao custDao;
	
	@Transactional
	@Override
	public void add(Customer customer) {
		
		custDao.add(customer);
	}
    
    @Transactional
	@Override
	public List<Customer> listCustomers() {
    	
		return custDao.listCustomers();
	}

}
