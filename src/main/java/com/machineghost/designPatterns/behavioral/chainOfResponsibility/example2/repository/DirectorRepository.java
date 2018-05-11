package com.machineghost.designPatterns.behavioral.chainOfResponsibility.example2.repository;

import java.util.Random;

public class DirectorRepository {
	
	public Boolean directorsAreAvailable() {
		Random rand = new Random();
		int i = rand.nextInt(10);
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
