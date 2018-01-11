package com.machineghost.designPatterns.behavioral.command;

import java.util.Stack;

/**
 * Command pattern demo. This class represents the Invoker object.
 * @author S. Stone-Loveall
 *
 */
public class PetSitterPaymentInvoker {
	
	private Stack<ICommand> history = new Stack<ICommand>();
	
	public void makePayment(ICommand paymentCommand) {
		boolean isSuccessful = paymentCommand.execute();
		history.add(paymentCommand);
		System.out.println("Payment complete.");
		
		if (!isSuccessful) {
			history.pop().undo();
			System.out.println("Payment was not successful: payment was voided.");
		}
	}
}
