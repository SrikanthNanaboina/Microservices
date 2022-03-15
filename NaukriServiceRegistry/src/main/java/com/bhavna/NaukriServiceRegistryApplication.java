package com.bhavna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NaukriServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaukriServiceRegistryApplication.class, args);
	}

}
