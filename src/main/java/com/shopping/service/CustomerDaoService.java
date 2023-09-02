package com.shopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopping.model.Customer;

@Service

public interface CustomerDaoService {
	
	public List<Customer> getCustomers();
	
	public void addCustomer(Customer customer);
	public boolean customerLoginValidation(String username,String password);
	
	public void updateCustomer(Customer customer);

}
