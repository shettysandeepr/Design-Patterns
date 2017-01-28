package com.learning.Singleton;

public class DBSingletonTest {

	public static void main(String[] args) {
		
		DBSingleton dbSingleton = DBSingleton.getInstance();
		System.out.println(dbSingleton.toString());

		DBSingleton anotherInstance = DBSingleton.getInstance();
		System.out.println(anotherInstance.toString());

		if (dbSingleton == anotherInstance) {
			System.out.println("They are the same instance");
		}
	}
}
