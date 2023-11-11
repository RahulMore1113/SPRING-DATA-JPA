package com.rahul.service;

import com.rahul.model.Person;
import com.rahul.model.PhoneNumber;

public interface IPersonMgmtService {

	public String savePerson(Person person);

	public String savePhoneNumber(Iterable<PhoneNumber> numbers);

	public Iterable<Person> fetchByPerson();

	public Iterable<PhoneNumber> fetchByPhoneNumber();

	public String deleteByPerson(int personId);

}
