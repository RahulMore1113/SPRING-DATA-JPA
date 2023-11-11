package com.rahul.service;

import java.util.List;

import com.rahul.document.Customer;
import com.rahul.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public String registerCustomer(CustomerDTO dto);

	public List<Customer> findAllCustomers();

	public String removeCustomer(String id);

}
