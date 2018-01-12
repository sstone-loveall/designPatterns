package com.machineghost.designPatterns.behavioral.observer;

public class VeterinaryNotesClient extends Observer {

	public VeterinaryNotesClient(Subject notes) {
		this.subject = notes;
		notes.attach(this);
	}
	
	public void addNote(String note) {
		subject.setState("Veterinary note logged: " + note);
	}
	
	@Override
	protected void update() {
		System.out.println("Veterinary Notes Source: " + subject.getState());

	}

}
