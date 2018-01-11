package com.machineghost.designPatterns.behavioral.templateMethod;

import java.util.Random;

/**
 * Template method pattern demo. This class represents the concrete class implementing the templated algorithm.
 * @author S. Stone-Loveall
 *
 */
public class CreditCardPayment extends PaymentTemplate {

	@Override
	public void processPayment() {
		// pretend there is code here to make a call to a credit processing API
		// Code here would be unique to calling the credit card API
		
		setIsSuccessful();
	}

	@Override
	public boolean paymentIsSuccessful() {
		return isSuccessful;
	}

	@Override
	protected String showConfirmation() {
		// This message is unique to credit card transactions. It could include the CC type, a specific confirmation number, etc.
		return "Payment is successful. Check your credit card statement for PetSitters, Inc.";
	}

	@Override
	protected String showErrorMessage() {
		// This message is unique to credit card transactions
		return "There has been an error. Payment cannot process at this time. Please check with your credit card compay.";
	}
	
	private boolean setIsSuccessful() {
		// this would be a verification step unique to credit card transactions if it were real code
		
		// inject some randomness so the demo shows undo actions upon failures
		isSuccessful = false;
		Random rand = new Random();
		int val = rand.nextInt(50);
		if (val % 2 == 0) {
			isSuccessful = true;
		}
		return isSuccessful;
	}
}
