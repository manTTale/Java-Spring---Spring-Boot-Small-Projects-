package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Time on the server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Have to run a nice 5k";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Fortune fortune";
	}

}
