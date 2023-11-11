package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.service.ICustomerMgmtService;

@SpringBootApplication
public class DaoSpringDataJpaDateTimeInsertionApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpaDateTimeInsertionApiApplication.class, args);

		ICustomerMgmtService service = context.getBean(ICustomerMgmtService.class);

//		Customer customer = new Customer("More", "Pune", LocalDateTime.of(2000, 02, 07, 10, 45), LocalDate.of(2023,  02, 02), LocalTime.of(10, 0));

//		System.out.println(service.registerCustomer(customer));

		service.getAllCustomer().forEach(System.out::println);

		((ConfigurableApplicationContext) context).close();
	}

}
