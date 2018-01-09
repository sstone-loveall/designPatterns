package com.machineghost.designPatterns.structural.flyweight;

/**
 * Flyweight pattern. This class represents a concrete flyweight object. Its attributes are immutable after instantiation.
 * @author S. Stone-Loveall
 *
 */
public class Genus implements ITaxonomy {

	private String title;
	
	public Genus(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
