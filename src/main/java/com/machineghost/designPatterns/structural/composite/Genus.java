package com.machineghost.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Composite pattern demo. This object is the Composite item. It is aware of its children "species".
 * @author S. Stone-Loveall
 *
 */
public class Genus extends Taxonomy {

	private String title;
	List<Taxonomy> species = new ArrayList<Taxonomy>();
	
	public Genus(String title) {
		this.title = title;
	}
	
	@Override
	public String showTaxonomy() {
		StringJoiner output = new StringJoiner(", ");

		for (Taxonomy s : species) {
			output.add(getTitle() + " " + s.showTaxonomy());
		}
		return output.toString();
	}
	
	public void addSpecies(Taxonomy taxonomyComponent) {
		species.add(taxonomyComponent);
	}
	
	public void removeSpecies(Taxonomy taxonomyComponent) {
		species.remove(taxonomyComponent);
	}

	public String getTitle() {
		return title;
	}
}
