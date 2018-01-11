package com.machineghost.designPatterns.behavioral.command;

import java.util.Random;

/**
 * Command pattern demo. This class represents the receiver object.
 * @author S. Stone-Loveall
 *
 */
public class Payment {
	
	private double amountPaid;
	private String username;
	private int paymentMethodId;
	
	public Payment(double amountPaid, String username) {
		this.amountPaid = amountPaid;
		this.username = username;
	}
	
	/**
	 * Make a payment. 
	 * @return true if payment was successful
	 */
	public boolean makePayment() {
		boolean isValidated = true;
		
		setPaymentMethodId();
		
		// pretend this code validates the payment, probably would call a bank API
		System.out.println("Payment of " + amountPaid + " by " + username);
		
		// inject some randomness so the demo shows undo actions upon failures
		Random rand = new Random();
		int val = rand.nextInt(50);
		if (val % 2 == 0) {
			isValidated = false;
		}
		return isValidated;
	}
	
	/**
	 * Void a payment.
	 */
	public void voidPayment() {
		// pretend this code voids a payment after failure to validate
	}
	
	/**
	 * Look up the user's payment method
	 */
	private void setPaymentMethodId() {
		// pretend the code looks up a saved payment method for the given user
		paymentMethodId = 1;
	}
}
