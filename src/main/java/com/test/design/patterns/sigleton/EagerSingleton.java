package com.test.design.patterns.sigleton;

public class EagerSingleton {
	
	private static final EagerSingleton es = new EagerSingleton();
	private EagerSingleton() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println(es);
	}
	public static EagerSingleton getEagerSingletonInstance(){
		return es;
	}
}
