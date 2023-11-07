package com.gonzalo.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableWebMvc
public class EmployeeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}

}
