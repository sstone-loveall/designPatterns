package com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2;

import com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2.repository.RespondentRepository;

public class RespondentHandler extends EmployeeHandler {
	public RespondentRepository repo = new RespondentRepository();
	
	public RespondentHandler() {
		isFree = repo.respondentsAreAvailable();
		successor = new ManagerHandler();
	}

	public void handleRequest() {
		if (isFree) {
			// do handle
			System.out.println("Respondent takes the call");
		} else {
			// push to successor
			successor.handleRequest();
		}
	}
}
