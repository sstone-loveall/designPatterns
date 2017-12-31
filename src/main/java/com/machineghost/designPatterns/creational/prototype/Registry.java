package com.machineghost.designPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype registry. In this example, instances of "Animal" objects are conjured and kept in a HashMap.
 * Callers using the registry will not need to instantiate Animal type objects.
 * @author S. Stone-Loveall
 */
public class Registry {
	private Map<AnimalType, Animal> animals = new HashMap<AnimalType, Animal>();
	
	public Registry() {
		loadAnimals();
	}
	
	public Animal createAnimal (AnimalType type) {
		Animal animal = null;
		try {
			// clones an existing instance for the given type
			animal = (Animal)(animals.get(type)).clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return animal;
	}
	
	private void loadAnimals() {
		// create some concrete instances of Animal and add them to the HashMap
		HouseCat cat = new HouseCat();
		cat.setGenus("felis");
		cat.setSpecies("catus");
		cat.setNapTime("afternoon");
		animals.put(AnimalType.HOUSECAT, cat);
		
		GoldFish fish =  new GoldFish();
		fish.setGenus("carassius");
		fish.setSpecies("auratus");
		fish.setSwimSpeed("leisurely");
		animals.put(AnimalType.GOLDFISH, fish);
	}
	
}
