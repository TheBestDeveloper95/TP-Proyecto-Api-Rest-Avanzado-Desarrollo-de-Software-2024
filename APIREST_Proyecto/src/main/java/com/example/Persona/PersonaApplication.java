package com.example.Persona;

import com.example.Persona.repositories.PersonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaApplication {
	private static final Logger logger = LoggerFactory.getLogger(PersonaApplication.class);

	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(PersonaApplication.class, args);

		System.out.println("funcionando");
	}



}
