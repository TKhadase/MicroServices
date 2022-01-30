package com.tushar.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/home")
	public String getHome() 
	{
		return "Welcome to Test Controller :"+new Date();
	}
	
}
