package com.prince.example.princedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrincedemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Sprint Boot");
		SpringApplication.run(PrincedemoApplication.class, args);
	}

}
