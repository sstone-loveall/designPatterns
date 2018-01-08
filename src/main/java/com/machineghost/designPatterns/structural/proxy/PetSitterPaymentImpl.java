package com.machineghost.designPatterns.structural.proxy;

/**
 * Proxy pattern demo. This class represents the Real Subject. This class is sensitive because it connects to the payment API.
 * @author S. Stone-Loveall
 *
 */
public class PetSitterPaymentImpl implements IPetSitterPayment {

	private String creditCardNumber;
	private String expiryDate;
	private String securityCode;
	private String confirmationCode;
	
	public void makePayment(String creditCardNumber, String expiryDate, String securityCode) {
		this.creditCardNumber = creditCardNumber;
		this.expiryDate = expiryDate;
		this.securityCode = securityCode;
		
		process();
	}
	
	private void process() {
		// stub
		// do some stuff to process payment
		// call some API or save to DB, etc.
		confirmationCode = creditCardNumber + " processed";
	}

	public String getConfirmationCode() {
		return confirmationCode;
	}

}
