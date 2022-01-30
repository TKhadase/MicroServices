package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class SbMs09CircutBreakerHystrixDefaultPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMs09CircutBreakerHystrixDefaultPropertiesApplication.class, args);
	}

}
