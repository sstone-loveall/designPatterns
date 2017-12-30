package com.machineghost.designPatterns.creational.singleton;

/**
 * Thread-safe Singleton pattern with lazy load.
 * @author S. Stone-Loveall
 * Credit: Pluralsight
 */
public class LazyLoadSingleton {
	
	// instantiate to null for lazy load
	private static LazyLoadSingleton instance = null;
	
	private LazyLoadSingleton() {}
	
	public static LazyLoadSingleton getInstance() {
		if (instance == null) {
			// thread-safe; put it here instead of method signature to save processing
			synchronized(LazyLoadSingleton.class) {
				if (instance == null) {
			instance = new LazyLoadSingleton();
				}
			}
		}
		return instance;
	}
}
