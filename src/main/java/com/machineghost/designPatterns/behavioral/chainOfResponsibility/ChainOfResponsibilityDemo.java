package com.machineghost.designPatterns.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		
		PetHandler catHandler = new CatHandler();
		PetHandler dogHandler = new DoggoHandler();
		PetHandler fishHandler = new FishHandler();
		catHandler.setSuccessor(dogHandler);
		dogHandler.setSuccessor(fishHandler);
		fishHandler.setSuccessor(catHandler);
		
		// demonstrate that the request is always forwarded to the appropriate handler
		// check the console output to verify 
		catHandler.handleRequest(PetType.DOGGO);
		catHandler.handleRequest(PetType.FISH);
		catHandler.handleRequest(PetType.CAT);
		
		dogHandler.handleRequest(PetType.CAT);
		dogHandler.handleRequest(PetType.FISH);
		dogHandler.handleRequest(PetType.DOGGO);
		
		fishHandler.handleRequest(PetType.CAT);
		fishHandler.handleRequest(PetType.DOGGO);
		fishHandler.handleRequest(PetType.FISH);
	}
}
