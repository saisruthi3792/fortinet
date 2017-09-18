package com.fortinet.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONS")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ACC_NO")
	private String accNo;
	
	@Column(name = "BAL")
	private long bal;
	
	public Customer() {
		
	}

	public Customer(String firstName, String lastName, String email, String accNo, long bal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.accNo = accNo;
		this.bal = bal;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getAccNo() {
		return accNo;
	}

	public long getBal() {
		return bal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setBal(long bal) {
		this.bal = bal;
	}
	
	
	
	
}
