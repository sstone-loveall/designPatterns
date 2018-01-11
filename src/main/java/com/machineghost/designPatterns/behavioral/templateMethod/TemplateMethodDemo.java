package com.machineghost.designPatterns.behavioral.templateMethod;

/**
 * Template Method pattern demonstration. 
 * @author S. Stone-Loveall
 *
 */
public class TemplateMethodDemo {

	public static void main (String[] args) {
		
		// Demo: Check the console for output
		
		PayPalPayment payment = new PayPalPayment();
		payment.doPayment();
		System.out.println("Processing complete: " + payment.isProcessingComplete());
		System.out.println("Payment succeeded: " + payment.paymentIsSuccessful());
		
		CreditCardPayment anotherPayment = new CreditCardPayment();
		anotherPayment.doPayment();
		System.out.println("Processing complete: " + anotherPayment.isProcessingComplete());
		System.out.println("Payment succeeded: " + anotherPayment.paymentIsSuccessful());
	}
}
