package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.bo.Customer;
import com.rahul.dao.ICustomerRepo;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registerCustomer(Customer customer) {

		return "Customer save with the id :: " + repo.save(customer).getCid();

	}

	@Override
	public List<Customer> getAllCustomer() {

		return (List<Customer>) repo.findAll();

	}

}
