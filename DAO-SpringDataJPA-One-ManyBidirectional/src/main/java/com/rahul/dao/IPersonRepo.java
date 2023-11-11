package com.rahul.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
