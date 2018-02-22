package com.ram.spring;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "run one hour to workout";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

}
