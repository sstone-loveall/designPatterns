package com.machineghost.designPatterns.structural.bridge;

/**
 * Implementor used in bridge pattern.
 * @author S. Stone-Loveall
 *
 */
public interface IFeeder {
	
	public abstract void giveFood(IFoodSelector foodSelector);
	
	abstract public boolean getIsFed();
	
	abstract public String getSelectedFood();
}
