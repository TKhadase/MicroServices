package com.tushar.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class TestController {

	private static int i=0;
	@GetMapping("/home")
	@HystrixCommand(fallbackMethod = "fallbackGetHome",
										commandProperties = {
										@HystrixProperty(name = "circuitBreaker.enabled", value = "true")//enable circuit breaker
										})
	public String getHome() {
		System.out.println("TestController.getHome()");
		if(true)
			throw new RuntimeException();
		
		return "Sucess Result :"+new Date();
	}
	
	public String fallbackGetHome() {
		i++;
		System.out.println("TestController.fallback_getHome(): "+i);
		return "error Result :"+new Date();
	}
	
}
