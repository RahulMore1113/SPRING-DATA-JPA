package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.ICoronaVaccineRepo;
import com.rahul.type.View;

@Service("service")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public <T extends View> List<T> searchVaccineByCompany(String company, Class<T> clazz) {
		
		return repo.findByCompanyOrderByCompanyDesc(company, clazz);
		
	}

	

}
