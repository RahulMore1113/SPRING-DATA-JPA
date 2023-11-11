package com.rahul;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.service.ICoronaVaccineMgmtService;
import com.rahul.type.ResultView;

@SpringBootApplication
public class DaoSpringDataJpaCustomeQueryAppStaticProjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(DaoSpringDataJpaCustomeQueryAppStaticProjectionApplication.class, args);

		ICoronaVaccineMgmtService service = context.getBean(ICoronaVaccineMgmtService.class);

		List<ResultView> price = service.searchVaccineByStartPrice(758.0);
		price.forEach(vaccine -> System.out.println(vaccine.getName() + " " + vaccine.getCountry()));

		((ConfigurableApplicationContext) context).close();
	}

}
