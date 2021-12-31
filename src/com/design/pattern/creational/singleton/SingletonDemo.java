package com.design.pattern.creational.singleton;

final class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class SingletonDemo{
	public static void main(String[] args) {
		Singleton obj=Singleton.getInstance("");
	}
}