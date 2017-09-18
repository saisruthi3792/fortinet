package com.fortinet.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.fortinet.spring.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Customer add(Customer customer) {
		try{
			em.persist(customer);
		}catch(Exception ex) {
			return null;
		}
		return customer;

	}

	@Override
	public List<Customer> listCustomers() {
		CriteriaQuery<Customer> criteriaQuery = em.getCriteriaBuilder().createQuery(Customer.class);
		@SuppressWarnings("unused")
		Root<Customer> root = criteriaQuery.from(Customer.class);
		return em.createQuery(criteriaQuery).getResultList();

	}

}
