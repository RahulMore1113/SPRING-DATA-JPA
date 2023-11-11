package com.rahul.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rahul.service.IPersonMgmtService;

@Component
public class AssociationRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(service.deleteByPerson(1));

//		// Load operation from Parent to Child [1 to Many]
//		service.fetchByPerson().forEach(person -> {
//			System.out.println("Parent :: " + person);
//			Set<PhoneNumber> child = person.getContactDetails();
//			child.forEach(contact -> {
//				System.out.println("Child :: " + child);
//			});
//		});
//
//		System.out.println();
//
//		// Load Operation from Child to Parent [Many to 1]
//		service.fetchByPhoneNumber().forEach(phone -> {
//			System.out.println("Phone Number :: " + phone);
//			Person person = phone.getPerson();
//			System.out.println(person);
//		});

//		// Save Operation Parent to Child
//
//		Person person = new Person("More", "Pune");
//
//		PhoneNumber p1 = new PhoneNumber(112233L, "Airtel", "Home");
//		PhoneNumber p2 = new PhoneNumber(334455L, "Idea", "Office");
//
//		Set<PhoneNumber> contactDetails = Set.of(p1, p2);
//		person.setContactDetails(contactDetails);
//
//		String status = service.savePerson(person);
//		System.out.println(status);

//		// Save Operation Child to Parent
//
//		PhoneNumber p1 = new PhoneNumber(9998887L, "Jio", "Home");
//		PhoneNumber p2 = new PhoneNumber(7776665L, "Idea", "Office");
//
//		Person person = new Person("More", "Nagar");
//
//		Set<PhoneNumber> phoneSet = Set.of(p1, p2);
//		person.setContactDetails(phoneSet);
//
//		System.out.println(service.savePhoneNumber(phoneSet));

	}

}
