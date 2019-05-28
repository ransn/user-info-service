package com.snr.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
public class UserInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInfoServiceApplication.class, args);
	}

}
