package com.machineghost.designPatterns.structural.flyweight;

/**
 * Demonstration of the Flyweight pattern. This client is adding species to a taxonomy catalog.
 * @author S. Stone-Loveall
 */
public class FlyweightDemo {

	public static void main(String[] args) {
		
		SpeciesCatalog catalog = new SpeciesCatalog();
		catalog.addSpecies("catus", "felis");
		catalog.addSpecies("silvestris", "felis");
		catalog.addSpecies("leo", "panthera");
		
		// demonstrate that the first and second genus objects represent the same object
		Species firstSpecies = catalog.getSpecies("catus");
		Species secondSpecies = catalog.getSpecies("silvestris");
		System.out.println(firstSpecies.getTitle() + " " + firstSpecies.getGenus());
		System.out.println(secondSpecies.getTitle() + " " + secondSpecies.getGenus());
		
		// demonstrate that the third genus is a different object
		Species thirdSpecies = catalog.getSpecies("leo");
		System.out.println(thirdSpecies.getTitle() + " " + thirdSpecies.getGenus());
	}
}
