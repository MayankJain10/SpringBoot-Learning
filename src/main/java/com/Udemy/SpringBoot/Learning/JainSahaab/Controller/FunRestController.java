package com.Udemy.SpringBoot.Learning.JainSahaab.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//inject properties for : coach.name and team.name 
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//expose a new endpoint for "teaminfo"
	@GetMapping(value="/teaminfo")
	public String getTeamInfo() {
		return "Coach Name : " + coachName +","+ " Team Name : " + teamName;
		
	}
	
	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello World!!";
	}
	
}
