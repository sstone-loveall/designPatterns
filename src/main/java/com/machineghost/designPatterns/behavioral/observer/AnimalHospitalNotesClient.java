package com.machineghost.designPatterns.behavioral.observer;

public class AnimalHospitalNotesClient extends Observer {

	public AnimalHospitalNotesClient(Subject notes) {
		this.subject = notes;
		notes.attach(this);
	}
	
	public void addNote(String note) {
		subject.setState("Animal Hospital: " + note);
	}
	
	@Override
	protected void update() {
		System.out.println("Animal Hospital Notes Client is aware of note: " + subject.getState());
	}
}
