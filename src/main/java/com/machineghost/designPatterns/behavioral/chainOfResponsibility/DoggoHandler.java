package com.machineghost.designPatterns.behavioral.chainOfResponsibility;

/**
 * Chain of Responsibility pattern demo. This class represents a concrete handler.
 * @author S. Stone-Loveall
 *
 */
public class DoggoHandler extends PetHandler {

	@Override
	public void handleRequest(PetType request) {
		if (request == PetType.DOGGO) {
			System.out.println("DoggoHandler handles " + request + " ~ Bork bork ~");
		}
		else {
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}

