package com.machineghost.designPatterns.structural.bridge;

/**
 * Demonstration of the bridge pattern. Illustrated with the concept of feeding animals. 
 * @author S. Stone-Loveall
 *
 */
public class BridgeDemo {
	
	public static void main(String[] args) {

		IFoodSelector foodSelector = new HouseCatFoodSelector();
		IFeeder feeder = new HouseCatFeeder();
		feeder.giveFood(foodSelector);
		
		IFoodSelector anotherFoodSelector = new GoldFishFoodSelector();
		IFeeder anotherFeeder = new GoldFishFeeder();
		anotherFeeder.giveFood(anotherFoodSelector);
		
		// demonstrate the behaviors were bridged
		System.out.println("Cat was fed " + feeder.getSelectedFood() + "? " + feeder.getIsFed());
		System.out.println("Fish was fed " + anotherFeeder.getSelectedFood() + "? " + anotherFeeder.getIsFed());
	}
}
