package com.machineghost.designPatterns.structural.proxy;

/**
 * Proxy pattern. This class represents the Subject interface.
 * @author S. Stone-Loveall
 *
 */
public interface IPetSitterPayment {
	public void makePayment(String creditCardNumber, String expiryDate, String securityCode); 
	public String getConfirmationCode();
}
