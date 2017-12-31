package com.machineghost.designPatterns.creational.factory;

/**
 * Concrete subclass of abstract superclass
 * @author S. Stone-Loveall
 */
public class ConcreteItemA extends Item {

	@Override
	public void createItem() {
		itemLabels.add("Concrete Item A.0");
		itemLabels.add("Concrete Item A.1");
		itemLabels.add("Concrete Item A.2");
	}
}
