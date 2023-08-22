package com.Deva.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Spring Boot actuator")
public class MyController {
@GetMapping("/test")
	 public String testingEndPoint() {
		return "Love you Spring Boot Activer Example ";
		 
	 }
}
