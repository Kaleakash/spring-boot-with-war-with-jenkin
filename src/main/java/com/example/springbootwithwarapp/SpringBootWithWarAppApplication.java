package com.example.springbootwithwarapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootWithWarAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithWarAppApplication.class, args);
	}

}
