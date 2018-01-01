package com.machineghost.designPatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstration of the adapter pattern used when returning related current and legacy code objects in the same list.
 * @author S. Stone-Loveall
 */
public class AnimalClient {
	
	public List<Animal> getAnimalsList() {
		List<Animal> animals = new ArrayList<Animal>();
		
		NewAnimal animalA = new NewAnimal("felis", "catus", "house cat");
		animals.add(animalA);
		
		LegacyAnimal animalB = new LegacyAnimal("carassius", "auratus");
		animals.add(new LegacyAnimalToAnimalAdapter(animalB));
		
		return animals;
	}
}
