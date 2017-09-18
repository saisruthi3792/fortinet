package com.fortinet.spring;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.fortinet.spring.config.AppConfig;
import com.fortinet.spring.entity.Customer;
import com.fortinet.spring.service.CustomerService;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService customerService = context.getBean(CustomerService.class);

		// Save customers to the database by invoking service method
		customerService
				.add(new Customer("SaiSruthi", "Vemuru", "saisruthi3792@gmail.com", "SSV10343688", (long) 3456657));
		customerService.add(new Customer("SaiKruthi", "Vemuru", "vsaikruthi92@gmail.com", "SKV203565", (long) 5000000));
		customerService
				.add(new Customer("Kalyani", "Polagani", "kalyani.polagani@gmail.com", "KP10343688", (long) 3456657));

		// Get the list of all customer details
		List<Customer> customers = customerService.listCustomers();
		for (Customer customer : customers) {
			System.out.println("Customer details:");
			System.out.println(customer.getFirstName());
			System.out.println(customer.getAccNo());
			System.out.println(customer.getBal());
		}

		context.close();
	}
}