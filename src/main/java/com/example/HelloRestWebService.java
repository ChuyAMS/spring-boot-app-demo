package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestWebService {

	@GetMapping(value = "/hello/{name}")
	public String greet(@RequestParam String name) {
		return "Hello " + name;
	}

}
