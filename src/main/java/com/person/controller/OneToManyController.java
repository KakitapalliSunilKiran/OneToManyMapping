package com.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.model.Person;
import com.person.service.OneToManyService;

@RestController
@RequestMapping("api/v3")
public class OneToManyController {

	@Autowired
	OneToManyService oneToManyService;
	
	/*
	 * JSON one to many
	 * 
	 {
	    "id":111,
	    "name":"sunil",
	    "mobiles":[
		        {
		            "id":112,
		            "provider":"airtel",
		            "mobilenum":"6734353636"
		        },
		        {
		            "id":113,
		            "provider":"airtel",
		            "mobilenum":"6734353636"
		        }
	    	]
	}
	 */
	
	@RequestMapping("/SaveAllRecords")
	public ResponseEntity<Person> oneToManyMapping(@RequestBody Person person) {
		return oneToManyService.saveToDb(person);
		
	}
	
	@RequestMapping("/SaveAllRecordsBulk")
	public ResponseEntity<Person> oneToManyMappingBulk(@RequestBody Person person) {
		return oneToManyService.saveToDbBulk(person);
		
	}
	
	
	
}
