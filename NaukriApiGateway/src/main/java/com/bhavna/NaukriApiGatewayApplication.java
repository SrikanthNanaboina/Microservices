package com.bhavna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class NaukriApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaukriApiGatewayApplication.class, args);
	}

}
