package com.rahul.service;

import java.util.List;

import com.rahul.bo.Customer;

public interface ICustomerMgmtService {

	public String registerCustomer(Customer customer);

	public List<Customer> getAllCustomer();

}
