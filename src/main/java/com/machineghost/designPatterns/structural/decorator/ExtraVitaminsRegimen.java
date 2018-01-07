package com.machineghost.designPatterns.structural.decorator;

/**
 * Decorator pattern demo. This class represents a concrete decorator. 
 * @author S. Stone-Loveall
 *
 */
public class ExtraVitaminsRegimen implements IRegimenDecorator {

	private IPetFeedingRegimen baseRegimen;
	
	public ExtraVitaminsRegimen(IPetFeedingRegimen baseRegimen) {
		this.baseRegimen = baseRegimen;
	}
	
	public String getRegimen() {
		return this.baseRegimen.getRegimen() + ", supplemental vitamins added for bonus nutrition";
	}
}
