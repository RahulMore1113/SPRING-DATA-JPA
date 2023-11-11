package com.rahul.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.model.Customer;
import com.rahul.model.Product;
import com.rahul.repo.ICustomerRepo;
import com.rahul.repo.IProductRepo;

@RestController
@RequestMapping("/api")
public class MultipleDataRestController {

	@Autowired
	private ICustomerRepo customerRepo;

	@Autowired
	private IProductRepo productRepo;

	@GetMapping("/products")
	public List<Product> findAllProduct() {

		return productRepo.findAll();

	}

	@GetMapping("/customers")
	public List<Customer> findAllCustomer() {

		return customerRepo.findAll();

	}

}
