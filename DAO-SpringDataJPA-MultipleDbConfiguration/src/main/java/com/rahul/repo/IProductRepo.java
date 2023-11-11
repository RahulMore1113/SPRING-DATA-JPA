package com.rahul.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
