package com.rahul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.ICustomerRepo;
import com.rahul.document.Customer;
import com.rahul.dto.CustomerDTO;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registerCustomer(CustomerDTO dto) {

		Customer customer = new Customer();
		BeanUtils.copyProperties(dto, customer);

		return "Document saved with the ID :: " + repo.insert(customer).getId();

	}

	@Override
	public List<Customer> findAllCustomers() {

		return repo.findAll();

	}

	@Override
	public String removeCustomer(String id) {

		Optional<Customer> optional = repo.findById(id);

		if (optional.isPresent()) {
			repo.delete(optional.get());
			return "Document is deleted...";
		}

		return "Document is not found";

	}

}
