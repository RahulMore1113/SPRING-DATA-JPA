package com.rahul.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rahul.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {

	@Query("FROM com.rahul.bo.CorornaVaccine WHERE company = :company")
	public List<CoronaVaccine> searchVaccineByCompany(String company);

	@Query("From CoronaVaccine WHERE company IN (:company1 :company2)")
	public List<CoronaVaccine> searchVaccineByCompanies(String company1, String company2);

	@Query("SELECT name, compant, price FROM CoronaVaccine WHERE price BETWEEN :min AND :max")
	public List<Object[]> searchVaccineByPriceRange(Double min, Double max);

	@Query("FROM CoronaVaccine WHERE name IN (:name1 :name2)")
	public List<CoronaVaccine> searchVaccinesByName(String name1, String name2);

}
