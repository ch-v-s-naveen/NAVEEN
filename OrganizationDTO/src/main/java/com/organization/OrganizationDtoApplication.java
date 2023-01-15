package com.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.organization.dto.persist"})
public class OrganizationDtoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OrganizationDtoApplication.class, args);
	}

}
