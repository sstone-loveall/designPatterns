package com.machineghost.designPatterns.behavioral.observer;

/**
 * Observer pattern demo. This abstract class represents the Observer interface.
 * @author S. Stone-Loveall
 *
 */
public abstract class Observer {
	
	protected Subject subject;
	
	protected abstract void update();

}
