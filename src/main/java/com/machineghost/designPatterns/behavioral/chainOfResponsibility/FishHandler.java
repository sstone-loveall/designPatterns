package com.machineghost.designPatterns.behavioral.chainOfResponsibility;

/**
 * Chain of Responsibility pattern demo. This class represents a concrete handler.
 * @author S. Stone-Loveall
 *
 */
public class FishHandler extends PetHandler {

	@Override
	public void handleRequest(PetType request) {
		if (request == PetType.FISH) {
			System.out.println("FishHandler handles " + request + " ~  OOOoo bubbles ooOOO ~");
		}
		else {
			if (successor != null) {
				successor.handleRequest(request);
			}
		}

	}

}
