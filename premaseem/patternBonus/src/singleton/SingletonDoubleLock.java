package com.premaseem.singleton;

public class SingletonDoubleLock {

	// Have a private constructor so that it cannot be instanciate other then
	// from this class.
	private SingletonDoubleLock() {
	}

	public static volatile SingletonDoubleLock uniqueInstance = null;

	public static final SingletonDoubleLock getInstance() {
		if (uniqueInstance == null) {

			synchronized (SingletonDoubleLock.class) {
				try {
					Thread.sleep(10000);
					if (uniqueInstance == null) {
						System.out.println("Creating the instance for first and only time ");
						uniqueInstance = new SingletonDoubleLock();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return uniqueInstance;
	}

	public int stateholder = 1;

	public void doCounting() {
		System.out.println("Each time this method is called, it current state would get incremanted by 5");
		for (int i = 1; i <= 5; i++, stateholder++)
			System.out.println("Count is " + stateholder);
	}

}
