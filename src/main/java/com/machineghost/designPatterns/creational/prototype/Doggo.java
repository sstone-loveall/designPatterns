package com.machineghost.designPatterns.creational.prototype;

public class Doggo extends Animal {
	
	private String playTime;
	private String feedingTime;
	
	public String getPlayTime() {
		return playTime;
	}
	
	public void setPlayTime(String playTime) {
		this.playTime = playTime;
	}

	@Override
	public String getFeedingTime() {
		return feedingTime;
	}

	public void setFeedingTime(String feedingTime) {
		this.feedingTime = feedingTime;
	}
}
