package com.machineghost.designPatterns.behavioral.chainOfResponsibility;

/**
 * Chain of Responsibility pattern demo. This class represents a concrete handler.
 * @author S. Stone-Loveall
 *
 */
public class CatHandler extends PetHandler {

	@Override
	public void handleRequest(PetType request) {
		if (request == PetType.CAT) {
			System.out.println("CatHandler handles " + request + " ~ Meow ~ ");
		}
		else {
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
