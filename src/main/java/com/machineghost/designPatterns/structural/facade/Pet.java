package com.machineghost.designPatterns.structural.facade;

public class Pet {
	
	private String label;
	private String feedTime;
	private String feedRegimen;
	
	public Pet(String label, String feedTime, String feedRegimen) {
		this.label = label;
		this.feedTime = feedTime;
		this.feedRegimen = feedRegimen;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getFeedTime() {
		return feedTime;
	}
	
	public void setFeedTime(String feedTime) {
		this.feedTime = feedTime;
	}
	
	public String getFeedRegimen() {
		return feedRegimen;
	}
	
	public void setFeedRegimen(String feedRegimen) {
		this.feedRegimen = feedRegimen;
	}
	
}
