package com.assosport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.assosport.repository.GymnasesRepository;
import com.assosport.repository.SportifRepository;

@EnableMongoRepositories(basePackageClasses = {SportifRepository.class, GymnasesRepository.class})
@SpringBootApplication
public class AssociationSportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssociationSportApplication.class, args);
	}

}
