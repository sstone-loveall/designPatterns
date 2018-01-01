package com.machineghost.designPatterns.structural.adapter;

/**
 * Demonstration of the adapter pattern. This class represents an example of legacy code. 
 * The class' non-legacy counterpart is the NewAnimal object.
 * @author S. Stone-Loveall
 *
 */
public class LegacyAnimal {
	private String classificationGenus;
	private String classificationSpecies;

	public LegacyAnimal(String classificationGenus, String classificationSpecies) {
		this.classificationGenus = classificationGenus;
		this.classificationSpecies = classificationSpecies;
	}
	
	public String getClassificationGenus() {
		return classificationGenus;
	}
	
	public void setClassificationGenus(String classificationGenus) {
		this.classificationGenus = classificationGenus;
	}
	
	public String getClassificationSpecies() {
		return classificationSpecies;
	}
	
	public void setClassificationSpecies(String classificationSpecies) {
		this.classificationSpecies = classificationSpecies;
	}
}
