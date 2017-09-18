package com.fortinet.unittest.mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


import com.fortinet.spring.dao.CustomerDao;
import com.fortinet.spring.entity.Customer;
import com.fortinet.spring.service.CustomerServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
    
	@Mock
	private CustomerDao customerDao;
    private Customer customer;
    @InjectMocks
    private CustomerServiceImpl customerService;
	
	@Before
    public void setupMock() {
		MockitoAnnotations.initMocks(this);
    	
    }
	
	 
    @Test
    public void testAdd() {
    	customer = new Customer();
    	customer.setId((long)1);
    	customer.setFirstName("SaiSruthi");
    	customer.setLastName("Vemuru");
    	customer.setEmail("ssv@gmail.com");
    	customer.setAccNo("ACC1234");
    	customer.setBal(1284);
    	
    	//determining the behavior of the add method in the service class
    	when(customerDao.add(any(Customer.class))).thenReturn(customer);
       
    	Customer newCustomer = customerService.add(customer);
        
    	//We are checking whether the add method in the dao is invoked or not.
    	assertNotNull(newCustomer);
        assertEquals("SaiSruthi", newCustomer.getFirstName());
        assertEquals("Vemuru", newCustomer.getLastName());
        assertEquals("ssv@gmail.com", newCustomer.getEmail());
 
        verify(customerDao).add(customer);
 
    }
    
    
    @Test
    public void testListCustomers() {
    	List<Customer> customers = new ArrayList<>();
    	Customer cust1 = new Customer();
    	Customer cust2 = new Customer();
      	cust1.setFirstName("SaiSruthi");
    	cust1.setLastName("Vemuru");
    	cust1.setEmail("ssv@gmail.com");
    	cust1.setAccNo("ACC1234");
    	cust1.setBal(1284);
    	customers.add(cust1);
    	cust2.setFirstName("SaiKruthi");
    	cust2.setLastName("Vemuru");
    	cust2.setEmail("skv@gmail.com");
    	cust2.setAccNo("ACC1235");
    	cust2.setBal(1284);
    	customers.add(cust2);
    	    	    	
    	//determining the behavior of the list customers method in the service class
    	when(customerDao.listCustomers()).thenReturn(customers);
       
    	List<Customer> customersTest = customerService.listCustomers();
        
    	//We are checking whether the listCustomers method in the dao is invoked or not.
    	assertNotNull(customersTest);
        assertEquals(customersTest.size(),customers.size());
 
 
        verify(customerDao).listCustomers();
 
    }


    @After
    public void tearDown() {
    	customerDao = null;
    	customerService = null;
    	customer = null;
    	
    }
}
    
