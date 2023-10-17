package com.nttdata.com;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.com.entity.Person;
import com.nttdata.com.repository.PersonRepository;

@SpringBootApplication
public class BirtApplication {
	
	@Autowired
	PersonRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(BirtApplication.class, args);
	}
	
	@PostConstruct
	void initdata(){
		
		repo.save(Person.builder().nombre("NOMBRE-1").apellidos("APELLIDOS-1").sexo("M").build());
		repo.save(Person.builder().nombre("NOMBRE-2").apellidos("APELLIDOS-2").sexo("M").build());
		repo.save(Person.builder().nombre("NOMBRE-3").apellidos("APELLIDOS-3").sexo("M").build());
		repo.save(Person.builder().nombre("NOMBRE-4").apellidos("APELLIDOS-4").sexo("F").build());
		
	}
	

}
