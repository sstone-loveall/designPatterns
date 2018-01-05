package com.machineghost.designPatterns.structural.composite;

/**
 * Composite pattern demo. This client is working with the hierarchy structure for taxonomy.
 * @author S. Stone-Loveall
 *
 */
public class CompositeDemo {
	public static void main(String[] args) {
		// create some leaf objects
		Species felineSpecies = new Species("catus");
		Species anotherFelineSpecies = new Species("chaus");
		
		// create a composite object and add leaves to it
		Genus felisGenus = new Genus("felis");
		felisGenus.addSpecies(felineSpecies);
		felisGenus.addSpecies(anotherFelineSpecies);
		
		// create some more leaf objects
		Species pantheraSpecies = new Species("tigris");
		Species anotherPantheraSpecies = new Species("leo");
		
		// create a composite object and add leaves to it
		Genus pantheraGenus = new Genus("panthera");
		pantheraGenus.addSpecies(pantheraSpecies);
		pantheraGenus.addSpecies(anotherPantheraSpecies);
		
		// demonstrate the list of items for both composite objects
		System.out.println(felisGenus.getTitle() + ": " + felisGenus.showTaxonomy());
		System.out.println(pantheraGenus.getTitle() + ": " + pantheraGenus.showTaxonomy());
	}
}
