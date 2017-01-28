package com.learning.Singleton;

public class SingletonPatternExample {

	public static void main(String[] args) {
		Runtime singletonRunTime = Runtime.getRuntime();
		singletonRunTime.gc();
		System.out.println(singletonRunTime.toString());

		Runtime anotherInstance = Runtime.getRuntime();
		System.out.println(anotherInstance.toString());

		if (singletonRunTime == anotherInstance) {
			System.out.println("They are the same instance");
		}
	}
}
