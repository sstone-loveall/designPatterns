package com.machineghost.designPatterns.structural.bridge;

/**
 * Concrete implementation using interface IFoodSelector
 * @author S. Stone-Loveall
 *
 */
public class GoldFishFoodSelector implements IFoodSelector {

	public String getSelectedFood() {
		return "kelp";
	}
}
