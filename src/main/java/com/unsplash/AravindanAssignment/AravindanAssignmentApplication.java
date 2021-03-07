package com.unsplash.AravindanAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.unsplash.AravindanAssignment.utils")
public class AravindanAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AravindanAssignmentApplication.class, args);
	}

}
