package com.machineghost.designPatterns.behavioral.observer;

import java.util.ArrayList;

/**
 * Observer pattern demo. This abstract class represents the Subject interface.
 * @author S. Stone-Loveall
 *
 */
public abstract class Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	protected abstract void setState(String state);
	
	protected abstract String getState();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
