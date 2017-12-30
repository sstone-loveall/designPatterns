package com.machineghost.designPatterns.creational.builder;

/**
 * Demonstration of Builder pattern. Shows example of creation of object with multiple properties. 
 * @author S. Stone-Loveall
 */
public class BuilderDemo {

	public static void main(String args[]) {
		
		Builder.InnerBuilder innerBuilder = new Builder.InnerBuilder();
		innerBuilder.property1("some value").property2("some other value");
		Builder builder = innerBuilder.build();
		
		// demo the builder object values
		System.out.println(builder.getProperty1());
		System.out.println(builder.getProperty2()); 
	}
}
