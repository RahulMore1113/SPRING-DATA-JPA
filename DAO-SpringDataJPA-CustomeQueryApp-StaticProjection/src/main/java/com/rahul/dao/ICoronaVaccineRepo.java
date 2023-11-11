package com.rahul.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.bo.CoronaVaccine;
import com.rahul.type.ResultView;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	
	public List<ResultView> findByPriceGreaterThanEqualOrderByPrice(Double price);
	
}
