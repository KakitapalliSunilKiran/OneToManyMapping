package com.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.model.Mobile;
import com.person.model.Person;
import com.person.repo.Mobilerepo;
import com.person.repo.Personrepo;

@Service
public class OneToManyService {
	
	
	@Autowired
	Personrepo personRepo;
	
	@Autowired
	Mobilerepo mobileNumRepo;

	public void saveToDb(Person person) {
		
		List<Mobile> mobiles=person.getMobiles();
		for(Mobile mobile:mobiles) {
			mobileNumRepo.save(mobile);
		}
		
		personRepo.save(person);
		
	}
	
}
