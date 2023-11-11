package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.rahul.bo.CoronaVaccine;
import com.rahul.dao.ICoronaVaccineRepo;

@Service
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vaccine, boolean ascOrder, String... properties) {

		Example<CoronaVaccine> example = Example.of(vaccine);
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, properties);

		return repo.findAll(example, sort);
	}

	@Override
	public CoronaVaccine getVaccineById(Long regNo) {

		return repo.getReferenceById(regNo);

	}

	@Override
	public String removeVaccinesByRegNo(Iterable<Long> regNo) {

		List<CoronaVaccine> list = repo.findAllById(regNo);

		if (list.size() != 0) {
			repo.deleteAllByIdInBatch(regNo);
			return list.size() + " no of records deleted";
		}

		return "Record not found for deletion";

	}

}
