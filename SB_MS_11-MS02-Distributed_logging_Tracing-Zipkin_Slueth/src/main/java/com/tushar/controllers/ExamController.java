package com.tushar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExamController {

	Logger log = LoggerFactory.getLogger(ExamController.class);
	
	@Autowired
	private RestTemplate restTemp;
	 
	@GetMapping("/home")
	public String getHome() {
		log.info("before ExamController getHome");
		String resp = restTemp.getForObject("http://localhost:8083/home", String.class);
		log.info("after ExamController getHome :" +resp);
		return "Exam, "+resp;
	}
	
	
}
