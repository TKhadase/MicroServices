package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class SbMs10CircutBreakerHystrixCustomPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMs10CircutBreakerHystrixCustomPropertiesApplication.class, args);
	}

}
