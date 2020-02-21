package com.openclassrooms.SafetyNet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SafetyNetApplication {

	public static void main(String[] args) {
		ParseJson.Parse();
		SpringApplication.run(SafetyNetApplication.class, args);
	}

}
