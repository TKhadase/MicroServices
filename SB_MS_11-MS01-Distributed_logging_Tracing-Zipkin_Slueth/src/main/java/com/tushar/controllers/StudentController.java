package com.tushar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {

	Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private RestTemplate restTemp;
	 
	@GetMapping("/home")
	public String getHome() {
		log.info("before StudentController getHome");
		String resp = restTemp.getForObject("http://localhost:8082/home", String.class);
		log.info("after StudentController getHome");
		return "Student facilities are: Coaching, "+resp;
	}
	
	
}
