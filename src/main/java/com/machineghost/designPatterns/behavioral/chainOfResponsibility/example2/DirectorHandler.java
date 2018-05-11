package com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2;

import com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2.repository.DirectorRepository;

public class DirectorHandler extends EmployeeHandler {

	public DirectorRepository repo = new DirectorRepository();
	
	public DirectorHandler() {
		isFree = repo.directorsAreAvailable();
		successor = null;
	}
	
	public void handleRequest() {
		if (isFree) {
			// do handle
			System.out.println("Director takes the call");
		} else {
			// nowhere else to push to successor
			System.out.println("All employees are busy");
		}
	}
}
