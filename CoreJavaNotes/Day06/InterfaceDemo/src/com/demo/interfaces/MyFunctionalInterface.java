package com.demo.interfaces;

@FunctionalInterface
public interface MyFunctionalInterface {
	void m1();
	default void m2() {
		m5();
		System.out.println("in m2 method");
	}
	static void m3() {
		m5();
		System.out.println("in static m3 method");
	}
	private static void m5() {
		System.out.println("in m5 method");
	}
	

}
