package com.example.jibdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JibdemoApplication {
	@GetMapping("/message")
	public String message(){
		return "Dockerize java application using Google Jib open source!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JibdemoApplication.class, args);
	}

}
