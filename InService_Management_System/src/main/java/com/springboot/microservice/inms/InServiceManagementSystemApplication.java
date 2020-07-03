package com.springboot.microservice.inms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class InServiceManagementSystemApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InServiceManagementSystemApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(InServiceManagementSystemApplication.class, args);
	}

}
