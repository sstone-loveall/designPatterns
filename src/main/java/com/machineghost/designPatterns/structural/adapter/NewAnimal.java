package com.machineghost.designPatterns.structural.adapter;

/**
 * Demonstration of the adapter pattern. This class represents an example of non-legacy code. 
 * The class' legacy counterpart is the LegacyAnimal object.
 * @author S. Stone-Loveall
 *
 */
public class NewAnimal extends Animal {

	private String genus;
	private String species;
	private String commonName;
	
	public NewAnimal(String genus, String species, String commonName) {
		this.genus = genus;
		this.species = species;
		this.commonName = commonName;
	}
	
	public String getGenus() {
		return genus;
	}

	public String getSpecies() {
		return species;
	}
	
	public void setGenus(String genus) {
		this.genus = genus;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	
	public String toString() {
		return "Genus: " + genus + ", species: " + species + ", common name: " + commonName;
	}
}
