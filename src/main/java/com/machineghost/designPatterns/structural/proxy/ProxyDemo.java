package com.machineghost.designPatterns.structural.proxy;

/**
 * Proxy pattern demo. This demo uses a security proxy to interact with a payment API. 
 * @author S. Stone-Loveall
 *
 */
public class ProxyDemo {

	public static void main(String[] args) {
		IPetSitterPayment service = (IPetSitterPayment)SecurityProxy.newInstance(new PetSitterPaymentImpl());
		service.makePayment("1234567812345678", "01/01/2021", "999");
		System.out.println(service.getConfirmationCode());
	}
}
