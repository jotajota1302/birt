package com.nttdata.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.com.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
