package com.machineghost.designPatterns.creational.factory;

/**
 * Concrete subclass of abstract superclass
 * @author S. Stone-Loveall
 */
public class ConcreteItemB extends Item {
	@Override
	public void createItem() {
		itemLabels.add("Concrete Item B.0");
		itemLabels.add("Concrete Item B.1");
		itemLabels.add("Concrete Item B.2");
	}
}
