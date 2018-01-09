package com.machineghost.designPatterns.structural.flyweight;

/**
 * Flyweight pattern. This class represents a concrete flyweight object. Its attributes are immutable after instantiation.
 * @author S. Stone-Loveall
 *
 */
public class Species implements ITaxonomy {

	private String title;
	private Genus genus;
	
	public Species(String title, Genus genus) {
		this.title = title;
		this.genus = genus;
	}
	
	public String getTitle() {
		return title;
	}

	public Genus getGenus() {
		return genus;
	}
}
