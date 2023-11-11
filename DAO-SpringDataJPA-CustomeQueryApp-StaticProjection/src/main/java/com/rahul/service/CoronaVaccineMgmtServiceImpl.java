package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.ICoronaVaccineRepo;
import com.rahul.type.ResultView;

@Service("service")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public List<ResultView> searchVaccineByStartPrice(Double price) {
		
		return repo.findByPriceGreaterThanEqualOrderByPrice(price);
		
	}

	

}
