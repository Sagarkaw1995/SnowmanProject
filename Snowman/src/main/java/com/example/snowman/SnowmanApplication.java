package com.example.snowman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.snowman")
public class SnowmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnowmanApplication.class, args);
	}
}
