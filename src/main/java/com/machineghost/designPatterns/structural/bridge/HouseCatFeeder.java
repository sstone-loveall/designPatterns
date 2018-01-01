package com.machineghost.designPatterns.structural.bridge;

/**
 * ConcreteImplementor used in bridge pattern.
 * @author S. Stone-Loveall
 *
 */
public class HouseCatFeeder implements IFeeder {

	private boolean isFed;
	private String selectedFood;
	
	public void giveFood(IFoodSelector foodSelector) {
		selectedFood = foodSelector.getSelectedFood();
		scoopFoodIntoDish();
		isFed = true;
	}

	public boolean getIsFed() {
		return isFed;
	}
	
	public String getSelectedFood() {
		return selectedFood;
	}
	
	private void scoopFoodIntoDish() {
		// do some unique scooping behaviors
	}
}
