package com.machineghost.designPatterns.creational.builder;

/**
 * Demonstration of Builder pattern. Shows example of creation of object with multiple properties. 
 * Using a builder simplifies the creation of an object with many optional parameters for this client.
 * @author S. Stone-Loveall
 */
public class BuilderDemo {

	public static void main(String args[]) {
		
		// instantiate a new Vet Chart and specify optional properties
		VeterinaryChart chart = new VeterinaryChart.Builder(AnimalType.CAT).setSex("female").setAge(5).setWeight(8.2).build();
		
		// demo that the object has the properties set
		System.out.println(chart.getAnimalType());
		System.out.println(chart.getWeight());
		
		// demonstrate that the breed property was not set
		System.out.println(chart.getBreed());
	}
}
