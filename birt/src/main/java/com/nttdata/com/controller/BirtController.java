package com.nttdata.com.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.com.entity.Person;
import com.nttdata.com.service.PersonService;

@RestController("/report")
public class BirtController {

	@Autowired
	PersonService personService;
	
	
	Logger logger= Logger.getLogger(BirtController.class);
	
	@GetMapping
	public ResponseEntity<List<Person>> getReport(){
		
		return ResponseEntity.ok(personService.findAll());
		
	}
	
}
