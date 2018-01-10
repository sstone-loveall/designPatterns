package com.machineghost.designPatterns.behavioral.chainOfResponsibility;

public abstract class PetHandler {

	PetHandler successor;
	
	public void setSuccessor(PetHandler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(PetType request);
}
