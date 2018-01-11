package com.machineghost.designPatterns.behavioral.templateMethod;

import java.util.Random;

/**
 * Template method pattern demo. This class represents the concrete class implementing the templated algorithm.
 * @author S. Stone-Loveall
 *
 */
public class PayPalPayment extends PaymentTemplate {

	@Override
	public void processPayment() {
		// pretend there is code here to make a call to the PayPal processing API
		// code here would be unique to connecting to PayPal
		
		setIsSuccessful();
	}

	@Override
	public boolean paymentIsSuccessful() {
		return isSuccessful;
	}

	@Override
	protected String showConfirmation() {
		// This message is unique to PayPal. IRL it would likely include a paypal specific transaction ID.
		return "Payment is successful. Check your credit card statement for 'PAYPAL - PetSitters, Inc.'";
	}

	@Override
	protected String showErrorMessage() {
		// This message is unique to PayPal transactions
		return "There has been an error. Payment cannot process at this time. Please verify with PayPal.";
	}
	
	private boolean setIsSuccessful() {
		// this would be a verification step unique to PayPal transactions if it were real code
		
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
