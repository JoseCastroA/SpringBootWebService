package com.mainWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.controllers")
public class MainWebService {

	public static void main(String[] args) {
		SpringApplication.run(MainWebService.class, args);
	}
}
