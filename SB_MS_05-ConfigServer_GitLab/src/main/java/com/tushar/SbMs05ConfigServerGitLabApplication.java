package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SbMs05ConfigServerGitLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMs05ConfigServerGitLabApplication.class, args);
	}

}
