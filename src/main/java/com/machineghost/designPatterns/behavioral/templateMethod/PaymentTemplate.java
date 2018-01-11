package com.machineghost.designPatterns.behavioral.templateMethod;

/**
 * Template Method pattern demo. This class represents the abstract base class.
 * @author S. Stone-Loveall
 *
 */
public abstract class PaymentTemplate {
	
	protected boolean isSuccessful;
	protected boolean transactionIsComplete;
	
	public abstract void processPayment();
	public abstract boolean paymentIsSuccessful();
	protected abstract String showConfirmation();
	protected abstract String showErrorMessage();
	
	// this is the template method
	public void doPayment() {
		System.out.println("Template method doPayment() executed");
		
		processPayment();
		if (paymentIsSuccessful()) {
			showConfirmation();
		}
		else {
			showErrorMessage();
		}
		
		transactionIsComplete = true;
	}
	
	public boolean isProcessingComplete() {
		return transactionIsComplete;
	}
}
