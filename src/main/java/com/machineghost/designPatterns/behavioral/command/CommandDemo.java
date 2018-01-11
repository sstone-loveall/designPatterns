package com.machineghost.designPatterns.behavioral.command;

/**
 * Command pattern demonstration. This class is the client. The console output will demonstrate the commands executed or undone.
 * @author S. Stone-Loveall
 *
 */
public class CommandDemo {

	public static void main(String[] args) {
		
		// create a receiver object
		Payment payment = new Payment(getAmountPaid(), getUsernameFromSession());
		
		// issue the command to the invoker
		PetSitterPaymentInvoker invoker = new PetSitterPaymentInvoker();
		invoker.makePayment(new PaymentCommand(payment));
	}
	
	private static String getUsernameFromSession() {
		// pretend this code pulls the logged-in user from a session object
		return "user12345";
	}
	
	private static Double getAmountPaid() {
		// pretend this code pulls the amount paid from a post request
		return 10.0;
	}
}
