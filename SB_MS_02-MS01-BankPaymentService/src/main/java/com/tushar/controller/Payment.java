package com.tushar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class Payment {

	@GetMapping("start")
	public String getPaymentHomeMsg() {
		return "Start Paying with us. Payment Modes : COD, UPI, NetBanking, DebitCard";
	}
	
}
