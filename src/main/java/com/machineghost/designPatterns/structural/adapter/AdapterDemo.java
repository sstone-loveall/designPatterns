package com.machineghost.designPatterns.structural.adapter;

import java.util.List;

/**
 * Demonstration of the adapter pattern.
 * @author S. Stone-Loveall
 */
public class AdapterDemo {
	public static void main(String[] args) {
		AnimalClient client = new AnimalClient();
		List<Animal> animals = client.getAnimalsList();
		System.out.println(animals);
	}
}
