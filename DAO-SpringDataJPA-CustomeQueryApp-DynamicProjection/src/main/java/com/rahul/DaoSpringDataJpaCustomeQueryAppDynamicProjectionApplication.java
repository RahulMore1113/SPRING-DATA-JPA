package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.service.ICoronaVaccineMgmtService;
import com.rahul.type.ResultView2;

@SpringBootApplication
public class DaoSpringDataJpaCustomeQueryAppDynamicProjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(DaoSpringDataJpaCustomeQueryAppDynamicProjectionApplication.class, args);

		ICoronaVaccineMgmtService service = context.getBean(ICoronaVaccineMgmtService.class);

		service.searchVaccineByCompany("Serum", ResultView2.class).forEach(view -> {
			System.out.println(view.getRegNo() + " " + view.getCompany() + " " + view.getCountry() + " "
					+ view.getName() + " " + view.getPrice());
		});

		((ConfigurableApplicationContext) context).close();
	}

}
