package com.codekul.Java28SeptSpringMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Java28SeptSpringMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java28SeptSpringMavenApplication.class, args);
	}
	@GetMapping
	public String getMsg(){
		return "hii Maven";
	}
}
