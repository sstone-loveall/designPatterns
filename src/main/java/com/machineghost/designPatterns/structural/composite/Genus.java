package com.machineghost.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Composite pattern demo. This object is the Composite item. It is aware of its children "species".
 * @author S. Stone-Loveall
 *
 */
public class Genus implements ITaxonomy {

	private String title;
	List<ITaxonomy> species = new ArrayList<ITaxonomy>();
	
	public Genus(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String showTaxonomy() {
		StringJoiner output = new StringJoiner(", ");

		for (ITaxonomy s : species) {
			output.add(getTitle() + " " + s.showTaxonomy());
		}
		return output.toString();
	}
	
	public void addSpecies(ITaxonomy taxonomyComponent) {
		species.add(taxonomyComponent);
	}
	
	public void removeSpecies(ITaxonomy taxonomyComponent) {
		species.remove(taxonomyComponent);
	}
}
