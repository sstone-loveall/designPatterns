package com.machineghost.designPatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract superclass for factory objects
 * @author S. Stone-Loveall
 *
 */
public abstract class Item {
	protected List<String> itemLabels = new ArrayList<String>();
	
	public List<String> getItemLabels() {
		return itemLabels;
	}
	
	public Item() {
		this.createItem();
	}
	
	public abstract void createItem();
}
