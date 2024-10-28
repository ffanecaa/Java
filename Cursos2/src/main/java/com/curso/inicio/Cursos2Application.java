package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication(scanBasePackages = {"com.curso.controller","com.curso.service"})
public class Cursos2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cursos2Application.class, args);
	}
	@Bean
	public RestClient restClient() {
		return RestClient.create();
	}

}
