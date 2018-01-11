package com.machineghost.designPatterns.behavioral.command;

/**
 * Command pattern demo. This class represents a Concrete Command object.
 * @author S. Stone-Loveall
 *
 */
public class PaymentCommand implements ICommand {

	private Payment payment;
	
	public PaymentCommand(Payment payment) {
		this.payment = payment;
	}
	
	public boolean execute() {
		return payment.makePayment();
	}

	public void undo() {
		payment.voidPayment();
	}
}
