package com.machineghost.designPatterns.creational.factory;

/**
 * Factory that returns fresh, concrete instance of objects with superclass Item.
 * @author S. Stone-Loveall
 */
public class ItemFactory {
	
	public static Item getItem(ItemType type) {
		switch (type) {
			case ConcreteItemA: {
				return new ConcreteItemA();
			}
			case ConcreteItemB: {
				return new ConcreteItemB();
			}
			default : {
				return null;
			}
		}
	}
}
