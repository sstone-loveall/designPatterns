package com.machineghost.designPatterns.creational.prototype;

/**
 * Concrete class that extends superclass Animal
 * @author S. Stone-Loveall
 */
public class HouseCat extends Animal {
	
	private String napTime;
	
	public String getNapTime() {
		return napTime;
	}
	
	public void setNapTime(String napTime) {
		this.napTime = napTime;
	}
}
