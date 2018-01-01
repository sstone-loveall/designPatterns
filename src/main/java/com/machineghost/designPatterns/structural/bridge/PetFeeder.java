package com.machineghost.designPatterns.structural.bridge;

/**
 * ConcreteImplementor used in bridge pattern.
 * @author S. Stone-Loveall
 *
 */
public class PetFeeder implements IFeeder {

	private boolean isFed;
	private String selectedFood;

	public void giveFood(IFoodSelector foodSelector) {
		selectedFood = foodSelector.getSelectedFood();
		handFoodToPet();
		isFed = true;
	}

	public boolean getIsFed() {
		return isFed;
	}

	public String getSelectedFood() {
		return selectedFood;
	}
	
	private void handFoodToPet() {
		// do some food giving activity unique to pets
		// you can imagine another feeder existing for zoo animals
	}
}
