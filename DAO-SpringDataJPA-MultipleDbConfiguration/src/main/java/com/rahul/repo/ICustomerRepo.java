package com.rahul.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
