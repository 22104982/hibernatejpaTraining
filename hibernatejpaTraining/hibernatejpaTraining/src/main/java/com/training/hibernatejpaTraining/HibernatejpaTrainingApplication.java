package com.training.hibernatejpaTraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.training.hibernatejpaTraining.repository")
@SpringBootApplication
public class HibernatejpaTrainingApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(HibernatejpaTrainingApplication.class, args);
	}

}
