package com.acorn.demo.jar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@RestController
class HelloWorldController {

//	@Value("${acorn.message:Default Profile Message}")
	@Value("${acorn.message}")
	private String acornMessage;

	@GetMapping("/")
	public String index() {
		return "Welcome Acorn! Profile: " + acornMessage;
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

}
