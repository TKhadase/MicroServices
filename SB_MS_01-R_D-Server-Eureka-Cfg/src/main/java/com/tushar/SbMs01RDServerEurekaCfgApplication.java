package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbMs01RDServerEurekaCfgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMs01RDServerEurekaCfgApplication.class, args);
	}

}
