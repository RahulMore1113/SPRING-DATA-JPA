package com.rahul.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.bo.CoronaVaccine;
import com.rahul.type.View;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {

	public <T extends View> List<T> findByCompanyOrderByCompanyDesc(String company, Class<T> clazz);

}
