package com.document.documentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.document")
public class DocumentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentServiceApplication.class, args);
	}

}
