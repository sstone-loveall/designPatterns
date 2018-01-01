package com.machineghost.designPatterns.structural.bridge;

/**
 * Concrete implementation using interface IFoodSelector
 * @author S. Stone-Loveall
 *
 */
public class HouseCatFoodSelector implements IFoodSelector {

	public String getSelectedFood() {
		return "tuna";
	}
}
