package com.eventoapp.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.eventoapp.controllers"})
@EntityScan("{com.eventoapp.models")

@EnableAutoConfiguration
@Configuration
@ComponentScan(value= "com.eventoapp")


@ComponentScan(basePackages = {"com.eventoapp"})
@EnableJpaRepositories("com.eventoapp.repository")

public class EventoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoappApplication.class, args);
	}

}
