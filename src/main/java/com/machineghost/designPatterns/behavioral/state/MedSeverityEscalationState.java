package com.machineghost.designPatterns.behavioral.state;

/**
 * State pattern demo. This class represents a Concrete State object.
 * @author S. Stone-Loveall
 *
 */
public class MedSeverityEscalationState extends EscalationState {

	private Alert alert;
	
	public MedSeverityEscalationState(Alert alert) {
		this.alert = alert;
	}
	
	@Override
	protected void handleRequest() {
		System.out.println("Escalation triggered");
		alert.setState(alert.getHighSeverityState());
	}
}
