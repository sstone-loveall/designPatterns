package com.machineghost.designPatterns.creational.prototype;

/**
 * Concrete class that extends superclass Animal
 * @author S. Stone-Loveall
 */
public class HouseCat extends Animal {
	
	private String napTime;
	private String feedingTime;
	
	public String getNapTime() {
		return napTime;
	}
	
	public void setNapTime(String napTime) {
		this.napTime = napTime;
	}

	@Override
	public String getFeedingTime() {
		return feedingTime;
	}

	public void setFeedingTime(String feedingTime) {
		this.feedingTime = feedingTime;
	}
}
