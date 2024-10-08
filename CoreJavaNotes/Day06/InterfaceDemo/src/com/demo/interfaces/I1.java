package com.demo.interfaces;

public interface I1 {
	default void m1() {
		System.out.println("in m1 I11111 method");
	}
	default void m3() {
		System.out.println("in m3 I1 method");
	}
	void m2();

}
