package com.machineghost.designPatterns.structural.decorator;

/**
 * Decorator pattern demo. This class represents a concrete decorator. 
 * @author S. Stone-Loveall
 *
 */
public class ShinyCoatRegimen implements IRegimenDecorator {

	private IPetFeedingRegimen baseRegimen;
	
	public ShinyCoatRegimen(IPetFeedingRegimen baseRegimen) {
		 this.baseRegimen = baseRegimen;
	}
	
	public String getRegimen() {
		return this.baseRegimen.getRegimen() + ", supplemental amino acids added for coat health.";
	}
}
