package com.iamgkt.springbootconfigmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootConfigmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigmapApplication.class, args);
	}


	String name = System.getenv("USER_NAME");

	@GetMapping("/greet")
	public String greetUser() {
		return "Hello... " + name + " !!!!!!!";
	}

}
