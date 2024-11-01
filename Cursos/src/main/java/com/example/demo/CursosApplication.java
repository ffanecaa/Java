package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages ="com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.cursoDao")
@SpringBootApplication(scanBasePackages={"com.curso.controller","com.curso.service"})


public class CursosApplication {

	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
	}

}
