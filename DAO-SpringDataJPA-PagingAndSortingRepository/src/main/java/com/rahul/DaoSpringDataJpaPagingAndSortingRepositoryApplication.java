package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpaPagingAndSortingRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpaPagingAndSortingRepositoryApplication.class,
				args);

		ICoronaVaccineMgmtService service = context.getBean(ICoronaVaccineMgmtService.class);

		service.fetchDetailsByPageNo(1, 3, true, "price", "name")
				.forEach((vaccine) -> System.out.println(vaccine.getPrice() + " == " + vaccine.getCountry()));

//		service.fetchDetails(true, "price", "name")
//				.forEach((vaccine) -> System.out.println(vaccine.getPrice() + " == " + vaccine.getCountry()));

		((ConfigurableApplicationContext) context).close();
	}

}
