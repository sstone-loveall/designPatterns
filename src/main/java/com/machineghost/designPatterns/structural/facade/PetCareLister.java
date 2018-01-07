package com.machineghost.designPatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import com.machineghost.designPatterns.creational.prototype.*;
import com.machineghost.designPatterns.structural.decorator.*;

/**
 * Facade pattern. This class simplifies existing logic into an easy-to-use interface for a client.
 * @author S. Stone-Loveall
 *
 */
public class PetCareLister {

	private List<Pet> pets;
	
	public PetCareLister() {
		pets = new ArrayList<Pet>();
	}
	
	public void addPet(String name, AnimalType animalType, String feedingTime, IPetFeedingRegimen regimen) {
		pets.add(new Pet(formatLabel(name, animalType), feedingTime, regimen.getRegimen()));
	}
	
	public String listPetCareInstructions() {
		StringJoiner instructions = new StringJoiner("; ");
		for (Pet p : pets) {
			instructions.add(p.getLabel() + " " + p.getFeedRegimen() + " in the "+ p.getFeedTime());
		}
		return instructions.toString();
	}
	
	private String formatLabel(String name, AnimalType animalType) {
		return name + " (" + animalType.toString().toLowerCase() + "):";
	}
}
