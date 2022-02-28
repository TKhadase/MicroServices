package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SbMs12ApiGateWayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMs12ApiGateWayZuulApplication.class, args);
	}

}
