package com.medinsky.lab4.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab4ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4ServerApplication.class, args);
	}

}
