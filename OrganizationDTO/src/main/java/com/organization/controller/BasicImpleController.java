package com.organization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicImpleController {

	
	@GetMapping("/getValues")
	public String demo() {
		return "Hello Naveen U wrote DTO classes";
	}
}
