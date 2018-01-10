package com.machineghost.designPatterns.behavioral.chainOfResponsibility;

/**
 * Chain of Responsibility pattern demo. This class represents the Handler.
 * @author S. Stone-Loveall
 *
 */
public abstract class PetHandler {

	PetHandler successor;
	
	public void setSuccessor(PetHandler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(PetType request);
}
