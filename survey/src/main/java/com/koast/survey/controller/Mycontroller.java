package com.koast.survey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

	@GetMapping(path="/welcome")
	public String welcome() {
		return "Hello World";
	}
}
