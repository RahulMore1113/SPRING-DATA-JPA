package com.rahul;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpaJpaRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpaJpaRepositoryApplication.class, args);

		ICoronaVaccineMgmtService service = context.getBean(ICoronaVaccineMgmtService.class);

//		CoronaVaccine vaccine = new CoronaVaccine(null, "Covaxin", "Bharat Bio-Tech", "India", 432.0, 3);
//		service.searchVaccineByGivenData(vaccine, true, "price").forEach(System.out::println);

//		CoronaVaccine vaccine = service.getVaccineById(1L);
//		if (vaccine != null)
//			System.out.println("Vaccine details are :: " + vaccine);
//		else
//			System.out.println("Record not found");

		List<Long> list = new ArrayList<>();
		list.add(6L);
		list.add(7L);
		list.add(8L);
		System.out.println(service.removeVaccinesByRegNo(list));

		((ConfigurableApplicationContext) context).close();
	}

}
