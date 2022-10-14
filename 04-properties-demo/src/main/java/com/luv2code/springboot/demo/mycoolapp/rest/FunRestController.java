package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teamInfo")
	public String sayTeamInfo() {
		return "The coach name is " + coachName +" and the team name is "+teamName;
	}
	
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
