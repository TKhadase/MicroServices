package com.tushar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class Payment {

	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("start")
	public String getPaymentHomeMsg() {
		return "Start Paying with us. Payment Modes : COD, UPI, NetBanking, DebitCard using port: "+serverPort;
	}
	
}
