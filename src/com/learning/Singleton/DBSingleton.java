package com.learning.Singleton;

public class DBSingleton {

	private static DBSingleton newInstance = null;

	private DBSingleton() {

	}

	public static DBSingleton getInstance() {
		if (newInstance == null)
			synchronized (DBSingleton.class) {
				if (newInstance == null) {
					newInstance = new DBSingleton();
				}
			}
		return newInstance;
	}
}
