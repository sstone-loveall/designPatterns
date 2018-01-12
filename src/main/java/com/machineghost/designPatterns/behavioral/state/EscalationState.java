package com.machineghost.designPatterns.behavioral.state;

/**
 * State pattern demo. This abstract class represents the State interface.
 * @author S. Stone-Loveall
 *
 */
public abstract class EscalationState {
	
	protected void handleRequest() {
		throw new UnsupportedOperationException("Implementation should happen in subclasses."); 
	}
}
