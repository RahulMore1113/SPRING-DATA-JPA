package com.rahul.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rahul.document.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
