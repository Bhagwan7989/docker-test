package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/message")
	public String getmassage() {
		return" Bhagwan Somwanshi";
		
	}
}
