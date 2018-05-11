package com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2;

import com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2.repository.ManagerRepository;

public class ManagerHandler extends EmployeeHandler {

	public ManagerRepository repo = new ManagerRepository();
	
	public ManagerHandler() {
		isFree = repo.managersAreAvailable();
		successor = new DirectorHandler();
	}
	
	public void handleRequest() {
		if (isFree) {
			// do handle
			System.out.println("Manager takes the call");
		} else {
			// push to successor
			successor.handleRequest();
		}

	}
}
