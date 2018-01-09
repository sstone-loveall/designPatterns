package com.machineghost.designPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Flyweight pattern demonstration. This class represents the factory. It limits the number of Genus objects created.
 * @author S. Stone-Loveall
 *
 */
public class SpeciesCatalog {

	private Map<String, Genus> genuses = new HashMap<String, Genus>();
	private Map<String, Species> species = new HashMap<String, Species>();
	
	private Genus addGenus(String genusName) {
		// only add a new genus object if it doesn't already exist
		if (!genuses.containsKey(genusName)) {
			genuses.put(genusName, new Genus(genusName));
		}
		return genuses.get(genusName);
	}
	
	public void addSpecies(String speciesName, String genusName) {
		if (!species.containsKey(speciesName)) {
			species.put(speciesName, new Species(speciesName, addGenus(genusName)));
		}
	}
	
	public Species getSpecies(String speciesName) {
		return species.get(speciesName);
	}
	
	public Genus getGenusForSpecies(String speciesName) {
		Species s = getSpecies(speciesName);
		if (s != null) {
			return s.getGenus();
		}
		else {
			throw new NoSuchElementException("Species is unknown");
		}
	}

}
