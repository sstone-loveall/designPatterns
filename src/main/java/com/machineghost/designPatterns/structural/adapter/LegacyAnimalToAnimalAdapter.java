package com.machineghost.designPatterns.structural.adapter;

/**
 * Demonstration of the adpater pattern. This adapter class translates a legacy LegacyAnimal object to the non-legacy object NewAnimal. 
 * Now the code can take advantage of abstract Animal and group these objects together.
 * @author S. Stone-Loveall
 */
public class LegacyAnimalToAnimalAdapter extends Animal {

	private LegacyAnimal instance;
	
	public LegacyAnimalToAnimalAdapter(LegacyAnimal instance) {
		this.instance = instance;
	}
	
	public String getGenus() {
		return instance.getClassificationGenus();
	}

	public String getSpecies() {
		return instance.getClassificationSpecies();
	}
	
	public String getCommonName() {
		// there is no common name attribute in the legacy code
		return "n/a";
	}
	
	public String toString() {
		return "Genus: " + instance.getClassificationGenus() + ", species: " + instance.getClassificationSpecies() + ", common name: " + getCommonName();
	}

}
