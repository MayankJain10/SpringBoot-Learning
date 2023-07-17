package com.Udemy.SpringBoot.Learning.JainSahaab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Udemy.SpringBoot.Learning.JainSahaab.Service.Coach;

@RestController
public class DemoRestController {

	// define a private field for the dependency
	@Autowired
	private Coach myCoach;
	
	@Autowired
	public DemoRestController(Coach theCoach) {
		theCoach = myCoach;
	}
	
	@GetMapping(value="/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
		
	}
}
