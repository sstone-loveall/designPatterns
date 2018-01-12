package com.machineghost.designPatterns.behavioral.state;

/**
 * State pattern demo. This class represents the Context object.
 * @author S. Stone-Loveall
 *
 */
public class Alert {
	
	EscalationState lowSeverityState;
	EscalationState medSeverityState;
	EscalationState highSeverityState;
	EscalationState currentState;
	
	public Alert() {
		// initialize state objects
		lowSeverityState = new LowSeverityEscalationState(this);
		medSeverityState = new MedSeverityEscalationState(this);
		highSeverityState = new HighSeverityEscalationState(this);
		
		// initialize new alerts to low
		currentState = lowSeverityState;
	}
	
	public void doAlertEscalation() {
		currentState.handleRequest();
	}

	public void setState(EscalationState state) {
		this.currentState = state;
	}
	
	public EscalationState getLowSeverityState() {
		return lowSeverityState;
	}

	public EscalationState getMedSeverityState() {
		return medSeverityState;
	}

	public EscalationState getHighSeverityState() {
		return highSeverityState;
	}
	
	public String toString() {
		return "Current state: " + currentState.getClass().getSimpleName();
	}
}
