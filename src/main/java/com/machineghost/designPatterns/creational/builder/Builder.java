package com.machineghost.designPatterns.creational.builder;

/**
 * Builder pattern with inner static class
 * @author S. Stone-Loveall
 */
public class Builder {

	public static class InnerBuilder {
		private String property1;
		private String property2;
		
		public InnerBuilder() { }
		
		public Builder build() {
			return new Builder(this);
		}
		
		public InnerBuilder property1(String property1) {
			this.property1 = property1;
			return this;
		}
		
		public InnerBuilder property2(String property2) {
			this.property2 = property2;
			return this;
		}
	}
	
	private final String property1;
	private final String property2;
	
	private Builder(InnerBuilder builder) {
		this.property1 = builder.property1;
		this.property2 = builder.property2;
	}
	
	public String getProperty1() {
		return this.property1;
	}
	
	public String getProperty2() {
		return this.property2;
	}
}
