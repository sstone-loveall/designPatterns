package com.machineghost.designPatterns.creational.prototype;

/**
 * Concrete class that extends superclass Animal
 * @author S. Stone-Loveall
 */
public class GoldFish extends Animal {
	
	private String swimSpeed;

	public String getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(String swimSpeed) {
		this.swimSpeed = swimSpeed;
	}
}
