package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpaQueryMethodsAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DaoSpringDataJpaQueryMethodsAppApplication.class, args);
		ICoronaVaccineMgmtService service = context.getBean(ICoronaVaccineMgmtService.class);
		service.fetchVaccineByCompany("bharatbiotech").forEach(System.out::println);
		((ConfigurableApplicationContext) context).close();

	}

}
