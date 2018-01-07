package com.machineghost.designPatterns.creational.prototype;

/**
 * Concrete class that extends superclass Animal
 * @author S. Stone-Loveall
 */
public class GoldFish extends Animal {
	
	private String swimSpeed;
	private String feedingTime;

	public String getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(String swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

	@Override
	public String getFeedingTime() {
		return feedingTime;
	}

	public void setFeedingTime(String feedingTime) {
		this.feedingTime = feedingTime;
	}
}
