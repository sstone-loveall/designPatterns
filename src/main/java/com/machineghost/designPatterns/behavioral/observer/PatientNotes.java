package com.machineghost.designPatterns.behavioral.observer;

import java.util.LinkedList;

/**
 * Observer pattern demo. This class represents the Concrete Subject object. 
 * @author S. Stone-Loveall
 *
 */
public class PatientNotes extends Subject {

	private LinkedList<String> notes = new LinkedList<String>();
	
	@Override
	protected void setState(String note) {
		notes.addFirst(note);
		this.notifyObservers();
	}

	@Override
	protected String getState() {
		return notes.peek();
	}
}
