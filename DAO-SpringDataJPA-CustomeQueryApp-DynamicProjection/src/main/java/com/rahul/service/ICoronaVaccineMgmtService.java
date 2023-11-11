package com.rahul.service;

import java.util.List;

import com.rahul.type.View;

public interface ICoronaVaccineMgmtService {

	public <T extends View> List<T> searchVaccineByCompany(String company, Class<T> clazz);

}
