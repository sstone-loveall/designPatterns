package com.machineghost.designPatterns.structural.flyweight;

/**
 * Demonstration of the Flyweight pattern, using the Integer object class. 
 * 
 * @author S. Stone-Loveall
 * Credit: pluralsight
 */
public class FlyweightDemo {

	public static void main(String[] args) {
		
		Integer firstInt = Integer.valueOf(5);
		Integer secondInt = Integer.valueOf(5);
		Integer thirdInt = Integer.valueOf(10);
		
		// demonstrate that the first and second variables represent the same object
		System.out.println(System.identityHashCode(firstInt));
		System.out.println(System.identityHashCode(secondInt));
		
		// demonstrate that the third variable is a new object
		System.out.println(System.identityHashCode(thirdInt));
	}
}
