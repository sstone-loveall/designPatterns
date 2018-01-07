package com.machineghost.designPatterns.structural.decorator;

/**
 * Decorator pattern demo. This class represents a concrete component. 
 * @author S. Stone-Loveall
 *
 */
public class AdultRegimen implements IPetFeedingRegimen {

	public String getRegimen() {
		return "Standard adult diet";
	}

}
