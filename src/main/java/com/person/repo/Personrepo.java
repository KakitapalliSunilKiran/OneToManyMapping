package com.person.repo;

import org.springframework.data.repository.CrudRepository;

import com.person.model.Person;

public interface Personrepo  extends CrudRepository<Person,Integer>{
	
}
