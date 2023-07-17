package com.Udemy.SpringBoot.Learning.JainSahaab.Service.Impl;

import org.springframework.stereotype.Component;

import com.Udemy.SpringBoot.Learning.JainSahaab.Service.Coach;

// component annotation mark the class as a spring bean
@Component
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		String msg = "Practice fast bowling for 15 minutes!";
		
		return msg;
	}

}
