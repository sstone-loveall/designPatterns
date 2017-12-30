package com.machineghost.designPatterns.creational.prototype;

/**
 * Demonstration of the Prototype pattern. Shows creation of multiple instances with cloned properties.
 * @author S. Stone-Loveall
 */
public class PrototypeDemo {
	
	public static void main(String args[]) {
		// Demo that property values are cloned between two object instances
		
		Registry registry = new Registry();
		
		// create an instance of HouseCat without using "new" (instances already created in registry)
		HouseCat cat = (HouseCat) registry.createAnimal(AnimalType.HOUSECAT);
		cat.setNapTime("morning");
		
		// create another instance of HouseCat without using "new"
		HouseCat anotherCat = (HouseCat) registry.createAnimal(AnimalType.HOUSECAT);
		anotherCat.setNapTime("evening");
		
		// demo that the instances are different but their shared properties are cloned
		System.out.println("instance id: " + cat);
		System.out.println(cat.getGenus());
		System.out.println(cat.getSpecies());
		
		System.out.println("instance id: " + anotherCat);
		System.out.println(anotherCat.getGenus());
		System.out.println(anotherCat.getSpecies());
	}
}
