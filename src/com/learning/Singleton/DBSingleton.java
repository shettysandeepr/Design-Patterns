package com.learning.Singleton;

public class DBSingleton {

	private static DBSingleton newInstance = new DBSingleton();

	private DBSingleton() {

	}

	public static DBSingleton getInstance() {
		return newInstance;
	}
}
