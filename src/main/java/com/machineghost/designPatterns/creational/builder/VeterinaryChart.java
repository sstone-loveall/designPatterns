package com.machineghost.designPatterns.creational.builder;

public class VeterinaryChart {
	
	private final AnimalType animalType;
	private final String breed;
	private final String sex;
	private final double weight;
	private final int age;
	
	public static class Builder {
		
		// required field
		private final AnimalType animalType;
		
		// optional fields, initialized to default values 
		private String breed = "";
		private String sex = "";
		private double weight = 0;
		private int age = 0;
		
		// constructor's parameter is the only required field
		public Builder(AnimalType animalType) {
			this.animalType = animalType;
		}
		
		public Builder setBreed(String val) {
			this.breed = val;
			return this;
		}
		
		public Builder setSex(String val) {
			this.sex = val;
			return this;
		}
		
		public Builder setWeight(double val) {
			this.weight = val;
			return this;
		}
		
		public Builder setAge(int val) {
			this.age = val;
			return this;
		}
		
		public VeterinaryChart build() {
			return new VeterinaryChart(this);
		}
	}
	
	// private constructor used to instantiate object based on builder object
	private VeterinaryChart(Builder builder) {
		animalType = builder.animalType;
		breed = builder.breed;
		sex = builder.sex;
		weight = builder.weight;
		age = builder.age;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public String getBreed() {
		return breed;
	}

	public String getSex() {
		return sex;
	}

	public double getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}
}
