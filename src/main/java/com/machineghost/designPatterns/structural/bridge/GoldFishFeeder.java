package com.machineghost.designPatterns.structural.bridge;

/**
 * ConcreteImplementor used in bridge pattern.
 * @author S. Stone-Loveall
 *
 */
public class GoldFishFeeder implements IFeeder {
	
	private boolean isFed;
	private String selectedFood;
	
	public void giveFood(IFoodSelector foodSelector) {
		isFed = true;
		selectedFood = foodSelector.getSelectedFood();
		
		// do the food giving stuff
	}
	
	public boolean getIsFed() {
		return isFed;
	}

	public String getSelectedFood() {
		return selectedFood;
	}
}
