package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.employee")
public class UpdateEmpMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateEmpMicroServiceApplication.class, args);
	}


@Bean
public RestTemplate getRestTemplate() {
	return new RestTemplate();
	
}
}
