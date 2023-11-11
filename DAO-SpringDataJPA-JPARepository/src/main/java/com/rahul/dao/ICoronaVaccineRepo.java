package com.rahul.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {

}
