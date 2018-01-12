package com.machineghost.designPatterns.behavioral.state;

/**
 * State pattern demo. This class represents the client.
 * @author S. Stone-Loveall
 *
 */
public class StateDemo {

	public static void main(String[] args) {
		
		// demonstrate in the console output the various states after each alert escalation
		
		Alert alert = new Alert();
		System.out.println(alert.toString());
		
		alert.doAlertEscalation();
		System.out.println(alert.toString());
		
		alert.doAlertEscalation();
		System.out.println(alert.toString());
		
		alert.doAlertEscalation();
		System.out.println(alert.toString());
	}
}
