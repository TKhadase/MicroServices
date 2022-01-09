package com.tushar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tushar.client.PaymentsDiscoveryClient;

@RestController
@RequestMapping("/orders")
public class Orders {

	@Autowired
	private PaymentsDiscoveryClient paymentClient;
	
	@GetMapping("start")
	public String getPaymentHomeMsg() {
		return "Start Ordering with us - "+paymentClient.getStartDetails();
	}
	
}
