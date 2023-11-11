package com.rahul.service;

import java.util.List;

import com.rahul.type.ResultView;

public interface ICoronaVaccineMgmtService {

	public List<ResultView> searchVaccineByStartPrice(Double price);
	
}
