package com.machineghost.designPatterns.behavioral.observer;

/**
 * Observer pattern demonstration.
 * @author S. Stone-Loveall
 *
 */
public class ObserverDemo {

	public static void main(String[] args) {
		Subject notes = new PatientNotes();
		
		// patient notes can be entered into the chart from a variety of independent sources
		// the notes are aware of each source via the observer pattern
		
		VeterinaryNotesClient vetCliet = new VeterinaryNotesClient(notes);
		AnimalHospitalNotesClient hospitalClient = new AnimalHospitalNotesClient(notes);
		
		vetCliet.addNote("Documented the Loveall's cat's follow up care");
		hospitalClient.addNote("Released the Loveall's cat from inpatient care");
	}
}
