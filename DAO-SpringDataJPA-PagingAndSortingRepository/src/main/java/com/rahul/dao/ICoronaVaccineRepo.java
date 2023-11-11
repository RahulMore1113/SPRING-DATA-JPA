package com.rahul.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.rahul.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends PagingAndSortingRepository<CoronaVaccine, Long> {
	
	

}
