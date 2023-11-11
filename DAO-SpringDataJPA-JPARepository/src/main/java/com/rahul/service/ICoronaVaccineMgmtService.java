package com.rahul.service;

import java.util.List;

import com.rahul.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {

	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vaccine, boolean ascOrder, String... properties);

	public CoronaVaccine getVaccineById(Long regNo);

	public String removeVaccinesByRegNo(Iterable<Long> regNo);

}
