package com.itechsearch.eureka.sampleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleServiceApplication.class, args);
	}
}
