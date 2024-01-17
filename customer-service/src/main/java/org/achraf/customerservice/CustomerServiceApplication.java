package org.achraf.customerservice;

import org.achraf.customerservice.entities.Customer;
import org.achraf.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			Customer customer1 = Customer.builder().firstName("John").lastName("Doe").email("john.doe@example.com").build();
			Customer customer2 = Customer.builder().firstName("Jane").lastName("Doe").email("jane.doe@example.com").build();
			Customer customer3 = Customer.builder().firstName("Alice").lastName("Smith").email("alice.smith@example.com").build();
			Customer customer4 = Customer.builder().firstName("Bob").lastName("Johnson").email("bob.johnson@example.com").build();
			Customer customer5 = Customer.builder().firstName("Eva").lastName("Brown").email("eva.brown@example.com").build();
			Customer customer6 = Customer.builder().firstName("Alex").lastName("Miller").email("alex.miller@example.com").build();
			Customer customer7 = Customer.builder().firstName("Sara").lastName("Wilson").email("sara.wilson@example.com").build();
			Customer customer8 = Customer.builder().firstName("Tom").lastName("Anderson").email("tom.anderson@example.com").build();

			customerRepository.saveAll(List.of(customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8));
		};
	}
}
