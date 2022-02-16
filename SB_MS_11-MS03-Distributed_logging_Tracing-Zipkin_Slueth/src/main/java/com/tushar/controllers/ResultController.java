package com.tushar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResultController {

	Logger log = LoggerFactory.getLogger(ResultController.class);
	
	@Autowired
	private RestTemplate restTemp;
	 
	@GetMapping("/home")
	public String getHome() {
		log.info("before ResultController getHome");
		return "Result.";
	}
	
	
}
