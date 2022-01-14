package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SbMs01Ms01OrderOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMs01Ms01OrderOpsApplication.class, args);
	}

}
