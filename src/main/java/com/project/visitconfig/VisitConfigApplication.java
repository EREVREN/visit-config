package com.project.visitconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VisitConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitConfigApplication.class, args);
	}

}
