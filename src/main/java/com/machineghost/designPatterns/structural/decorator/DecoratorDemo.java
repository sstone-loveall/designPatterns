package com.machineghost.designPatterns.structural.decorator;

/**
 * Decorator pattern demo. 
 * @author S. Stone-Loveall
 *
 */
public class DecoratorDemo {
	public static void main(String[] args) {
		
		// produce a base functionality object
		IPetFeedingRegimen regimen = new AdultRegimen();
		System.out.println(regimen.getRegimen());
		
		// produce a decorated object
		IPetFeedingRegimen anotherRegimen = new YouthRegimen();
		anotherRegimen = new ShinyCoatRegimen(anotherRegimen);
		System.out.println(anotherRegimen.getRegimen());
	}
}
