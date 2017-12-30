package com.machineghost.designPatterns.creational.prototype;

public abstract class Animal implements Cloneable {
	private String species;
	private String genus;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getGenus() {
		return genus;
	}
	
	public void setGenus(String genus) {
		this.genus = genus;
	}
}
