package com.rahul;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rahul.model.Customer;
import com.rahul.model.Product;
import com.rahul.repo.ICustomerRepo;
import com.rahul.repo.IProductRepo;

@SpringBootApplication
public class DaoSpringDataJpaMultipleDbConfigurationApplication implements CommandLineRunner {

	@Autowired
	private ICustomerRepo customerRepo;

	@Autowired
	private IProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(DaoSpringDataJpaMultipleDbConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		customerRepo.saveAll(
				Arrays.asList(
						new Customer(10, "Rahul", "rahul@gmaiil.com"),
						new Customer(11, "More", "more@gmaiil.com"), 
						new Customer(12, "Krishna", "krishna@gmaiil.com")
						)
				);
		
		productRepo.saveAll(
				Arrays.asList(
						new Product(10, "PR-10", "PlayStation"),
						new Product(11, "PR-11", "X-Box"), 
						new Product(12, "PR-12", "VideoGame")
						)
				);

	}

}
