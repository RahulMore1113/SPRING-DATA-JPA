package com.rahul.service;

import com.rahul.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {

	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties);

	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties);
	
	public void fetchDetailsByPagination(int pageSize);

}
