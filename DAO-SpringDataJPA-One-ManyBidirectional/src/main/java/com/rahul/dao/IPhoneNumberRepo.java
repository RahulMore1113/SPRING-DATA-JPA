package com.rahul.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.PhoneNumber;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}
