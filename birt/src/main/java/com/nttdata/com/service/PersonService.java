package com.nttdata.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.com.entity.Person;
import com.nttdata.com.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repository;

	public List<Person> findAll(){
		
		return repository.findAll();

	}
}
