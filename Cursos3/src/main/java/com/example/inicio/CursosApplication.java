package com.example.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages ="com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.cursoDao")
@SpringBootApplication(scanBasePackages={"com.curso.controller","com.curso.service","com.example.inicio"})


public class CursosApplication {

	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
	}

}
