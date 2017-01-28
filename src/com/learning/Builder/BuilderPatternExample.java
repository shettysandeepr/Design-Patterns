package com.learning.Builder;

public class BuilderPatternExample {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("This is an example");
		builder.append("of a builder pattern. ");
		builder.append("It has methods to append");
		builder.append("almost everything we want to a String. ");
		builder.append(42);

		System.out.println(builder.toString());
	}
}
