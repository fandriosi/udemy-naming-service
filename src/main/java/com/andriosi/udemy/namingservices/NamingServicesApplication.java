package com.andriosi.udemy.namingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingServicesApplication.class, args);
	}

}
