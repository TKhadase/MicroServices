package com.tushar.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("BankPayment-operations")
public interface PaymentsClient {

	@GetMapping("/payments/start")
	public String getPaymentOptions();
	
}
