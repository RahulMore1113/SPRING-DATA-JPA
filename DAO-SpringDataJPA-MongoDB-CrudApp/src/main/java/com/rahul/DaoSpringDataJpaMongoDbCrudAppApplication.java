package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.service.ICustomerMgmtService;

@SpringBootApplication
public class DaoSpringDataJpaMongoDbCrudAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpaMongoDbCrudAppApplication.class, args);

		ICustomerMgmtService service = context.getBean(ICustomerMgmtService.class);

//		System.out.println(service.registerCustomer(new CustomerDTO(21, "Krishna", 101.0f)));
//		System.out.println(service.registerCustomer(new CustomerDTO(23, "Rahul", 102.0f)));
//		System.out.println(service.registerCustomer(new CustomerDTO(32, "Love", 104.0f)));

//		service.findAllCustomers().forEach(System.out::println);

		System.out.println(service.removeCustomer("64dbc51474ddc25d2b71e385"));

		((ConfigurableApplicationContext) context).close();
	}

}
