package com.demo.beans;

import com.demo.services.Interface1;
import com.demo.services.Interface2;

public class MyClass implements Interface1,Interface2 {
	
	public void m1() {
		System.out.println("inside m1 method of MyClass");
	}
	
	public int m2(int c) {
		System.out.println("inside m2 method of MyClass");
		return c*10;
	}
	public void m3() {
		System.out.println("inside m3 method of MyClass");
	}

}
