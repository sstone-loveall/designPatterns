package com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2;

/***
 * Chain of responsibility demo/example.
 * 
 * Call center: A call center has multiple levels of employees. There is a hierarchy to who takes the calls. 
 * The call client need only direct the call to the default handler then the chain of responsibility will route it appropriately. 
 * 
 * If no handler is available, the call will not connect.
 *
 */
public class CallClient {
	public static void main(String[] args) {
		EmployeeHandler handler = new RespondentHandler();
		handler.handleRequest();
	}
}
