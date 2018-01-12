package com.machineghost.designPatterns.behavioral.state;

public class HighSeverityEscalationState extends EscalationState {

	private Alert alert;
	
	public HighSeverityEscalationState(Alert alert) {
		this.alert = alert;
	}
	
	@Override
	protected void handleRequest() {
		System.out.println("Escalation triggered");
		
		// Do nothing. There are no higher escalation states.
		System.out.println("Alert remains in : " + alert.toString());
	}
}
