package com.assosport;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.assosport.repository.GymnasesRepository;
import com.assosport.repository.SportifRepository;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableMongoRepositories(basePackageClasses = {SportifRepository.class, GymnasesRepository.class})
@SpringBootApplication
public class AssociationSportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssociationSportApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer getCorsConfiguration(){
		return new WebMvcConfigurer() {

			@Value("${allowed.origin}")
			private String allowedOrigin;
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				//WebMvcConfigurer.super.addCorsMappings(registry);
				registry.addMapping("/api/**")
						.allowedOrigins(allowedOrigin)
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("*");
			}
		};
	}
}
