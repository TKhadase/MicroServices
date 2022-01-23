package com.tushar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RefreshScope
public class Payment {

	@Value("${server.port}")
	private String serverPort;
	
	@Value("${name}")
	private String name;

	@Value("${addrs}")
	private String addrs;
	
	@GetMapping("start")
	public String getPaymentHomeMsg() {
		return name+", Start Paying with us. Payment Modes : COD, UPI, NetBanking, DebitCard using port: "+serverPort + ".  "+addrs;
	}
	
}
