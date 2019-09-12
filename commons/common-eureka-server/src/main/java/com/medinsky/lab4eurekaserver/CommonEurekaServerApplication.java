package com.medinsky.lab4eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CommonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonEurekaServerApplication.class, args);
	}

}