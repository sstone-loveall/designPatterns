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
		selectedFood = foodSelector.getSelectedFood();
		sprinkleFoodOverWater();
		isFed = true;
	}
	
	public boolean getIsFed() {
		return isFed;
	}

	public String getSelectedFood() {
		return selectedFood;
	}
	
	private void sprinkleFoodOverWater() {
		// do some unique sprinkle behaviors
	}
}
