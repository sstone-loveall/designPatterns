package com.machineghost.designPatterns.structural.facade;

import com.machineghost.designPatterns.creational.prototype.AnimalType;
import com.machineghost.designPatterns.structural.decorator.*;

/**
 * Demo of Facade pattern. Contrast the simplified code below to the code in NoFacadeDemo.
 * @author S. Stone-Loveall
 *
 */
public class FacadeDemo {
	
	public static void main(String[] args) {
		PetCareLister instructions = new PetCareLister();
		instructions.addPet("catFamily1", AnimalType.HOUSECAT, "morning", new AdultRegimen());
		instructions.addPet("catFamily2", AnimalType.HOUSECAT, "evening", new YouthRegimen());
		instructions.addPet("dogFamily3", AnimalType.DOGGO, "morning", new ShinyCoatRegimen(new AdultRegimen()));
		instructions.addPet("fishFamily4", AnimalType.GOLDFISH, "afternoon", new AdultRegimen());
		System.out.println(instructions.listPetCareInstructions());
	}
}


