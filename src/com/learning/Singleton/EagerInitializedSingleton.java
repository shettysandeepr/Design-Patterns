package com.learning.Singleton;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton eagerInitializedSingleton = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public EagerInitializedSingleton getInstance() {
		return eagerInitializedSingleton;
	}
}
