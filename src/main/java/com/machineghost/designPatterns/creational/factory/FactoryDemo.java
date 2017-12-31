package com.machineghost.designPatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstration of the factory pattern which uses an abstract superclass
 * @author S. Stone-Loveall
 *
 */

public class FactoryDemo {
	
	private static void demoAttributes(Item itemA, Item itemB) {
		// Demonstrate the item attributes are different
		List<Item> items = new ArrayList<Item>();
		items.add(itemA);
		items.add(itemB);
		for (Item i : items) {
			System.out.println("Type: " + i.getClass() + " attibute values: " + i.getItemLabels());
		}
	}
	
	private static void demoUniqueness(Item itemA, Item itemB) {
		Item anotherItemA = ItemFactory.getItem(ItemType.ConcreteItemA);
		Item anotherItemB = ItemFactory.getItem(ItemType.ConcreteItemB);
		
		// Demonstrate the instantiated objects of the same type are unique
		System.out.println("Objects are unique: " + !itemA.equals(anotherItemA));
		System.out.println("Objects are unique: " + !itemB.equals(anotherItemB));
	}
	
	public static void main(String[] args) {
		
		Item itemA = ItemFactory.getItem(ItemType.ConcreteItemA);
		Item itemB = ItemFactory.getItem(ItemType.ConcreteItemB);
		
		// Demonstrate the item attributes are different
		demoAttributes(itemA, itemB);
		
		// Demonstrate the instantiated objects of the same type are unique
		demoUniqueness(itemA, itemB);
	}
}
