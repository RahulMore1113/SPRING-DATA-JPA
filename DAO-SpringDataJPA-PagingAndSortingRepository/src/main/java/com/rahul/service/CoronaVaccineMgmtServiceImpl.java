package com.rahul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.rahul.bo.CoronaVaccine;
import com.rahul.dao.ICoronaVaccineRepo;

@Service("service")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties) {

		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);

		return repo.findAll(sort);

	}

	@Override
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {

		Pageable page = PageRequest.of(pageNo, pageSize, asc ? Direction.ASC : Direction.DESC, properties);

		return repo.findAll(page);

	}

	@Override
	public void fetchDetailsByPagination(int pageSize) {
		
		
	}

}
