package com.rahul.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.IPersonRepo;
import com.rahul.dao.IPhoneNumberRepo;
import com.rahul.model.Person;
import com.rahul.model.PhoneNumber;

@Service
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo personRepo;

	@Autowired
	private IPhoneNumberRepo phoneRepo;

	@Override
	public String savePerson(Person person) {
		return "Person & his phone number saved with the id :: " + personRepo.save(person).getPid();
	}

	@Override
	public String savePhoneNumber(Iterable<PhoneNumber> numbers) {

		PhoneNumber save = null;

		for (PhoneNumber phoneNumber : numbers)
			save = phoneRepo.save(phoneNumber);

		return ((Set<PhoneNumber>) numbers).size() + " no of  phoneNumbers are saved with the number "
				+ save.getRegNo();
	}

	@Override
	public Iterable<Person> fetchByPerson() {
		return personRepo.findAll();
	}

	@Override
	public Iterable<PhoneNumber> fetchByPhoneNumber() {
		return phoneRepo.findAll();
	}

	@Override
	public String deleteByPerson(int personId) {

		Optional<Person> optional = personRepo.findById(personId);

		if (optional.isPresent()) {
			personRepo.delete(optional.get());
			return "Person and his phone number is deleted";
		}

		return "Person not found";
	}

}
