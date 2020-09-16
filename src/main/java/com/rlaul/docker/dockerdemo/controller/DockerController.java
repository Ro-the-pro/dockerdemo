package com.rlaul.docker.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/name")
	public String getMyName() {
		return "Rohitash's Simple Spring Boot Application";
	}

}
