package com.datacenter.dcscontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DCSControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DCSControllerApplication.class, args);
	}
}
