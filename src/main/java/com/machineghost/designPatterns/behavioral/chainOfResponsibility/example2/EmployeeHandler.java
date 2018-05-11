package com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2;

public abstract class EmployeeHandler {
	
	EmployeeHandler successor;
	Boolean isFree;
	
	public abstract void handleRequest();
}
