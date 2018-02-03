package com.test.design.patterns.sigleton;

public class LazySingleton {

	private static LazySingleton ls = null;
	private LazySingleton(){
		super();
		System.out.println(ls);
	}
	public static LazySingleton getLazySingleton(){
		if(ls== null)
			ls = new LazySingleton();
		return ls;
	}
	
}
