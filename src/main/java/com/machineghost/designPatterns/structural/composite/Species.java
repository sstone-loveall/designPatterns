package com.machineghost.designPatterns.structural.composite;

/**
 * Composite pattern demo. This object represents a Leaf. 
 * @author S. Stone-Loveall
 *
 */
public class Species extends Taxonomy {

	private String title;

	public Species(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String showTaxonomy() {
		 return getTitle();
	}
}
