package com.machineghost.designPatterns.structural.facade;

import java.util.StringJoiner;

import com.machineghost.designPatterns.creational.prototype.*;
import com.machineghost.designPatterns.structural.decorator.*;

/**
 * Demo of code NOT using a Facade. This class is an example of a messy client with no facade class to simplify it.
 * @author S. Stone-Loveall
 *
 */
public class NoFacadeDemo {
	
	public static void main(String[] args) {
		
		StringJoiner instructionList = new StringJoiner(", ");
		
		// For a neighborhood pet sitter, compile all client animals needs
		
		Registry registry = new Registry();
		
		// create an instance of HouseCat without using "new" (instances already created in registry)
		HouseCat catFamily1 = (HouseCat) registry.createAnimal(AnimalType.HOUSECAT);
		catFamily1.setFeedingTime("morning");
		IPetFeedingRegimen regimen = new AdultRegimen();
		instructionList.add("catFamily1: feed " + regimen.getRegimen() + " in the "+ catFamily1.getFeedingTime());
		
		// create another instance of HouseCat without using "new"
		HouseCat catFamily2 = (HouseCat) registry.createAnimal(AnimalType.HOUSECAT);
		catFamily2.setFeedingTime("evening");
		IPetFeedingRegimen regimen2 = new YouthRegimen();
		instructionList.add("catFamily2: feed " + regimen2.getRegimen() + " in the "+ catFamily2.getFeedingTime());
		
		Doggo dogFamily3 = (Doggo) registry.createAnimal(AnimalType.DOGGO);
		dogFamily3.setFeedingTime("morning");
		IPetFeedingRegimen regimen3 = new AdultRegimen();
		IPetFeedingRegimen decoratedRegimen = new ShinyCoatRegimen(regimen3);
		instructionList.add("dogFamily3: feed " + decoratedRegimen.getRegimen() + " in the "+ dogFamily3.getFeedingTime());
		
		GoldFish fishFamily4 = (GoldFish) registry.createAnimal(AnimalType.GOLDFISH);
		fishFamily4.setFeedingTime("afternoon");
		IPetFeedingRegimen regimen4 = new AdultRegimen();
		instructionList.add("fishFamily4: feed " + regimen4.getRegimen() + " in the "+ fishFamily4.getFeedingTime());
		
		// print the care instructions for all the animals
		System.out.println(instructionList);
	}
}
