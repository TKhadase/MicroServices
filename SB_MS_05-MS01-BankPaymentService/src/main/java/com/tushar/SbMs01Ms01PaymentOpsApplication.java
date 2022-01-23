package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SbMs01Ms01PaymentOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMs01Ms01PaymentOpsApplication.class, args);
	}

}
