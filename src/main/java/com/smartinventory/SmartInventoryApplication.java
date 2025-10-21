package com.smartinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.cdi.Eager;

@SpringBootApplication
@EntityScan("com.smartinventory.entity")
@EnableJpaRepositories("com.smartinventory.repository")
public class SmartInventoryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartInventoryApplication.class, args);
	}
}
