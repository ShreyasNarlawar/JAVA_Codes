package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.services.*;



public class TestInterface {
	
	public static void main(String[] args) {
		
		MyClass s = new MyClass();
		
		System.out.println(s.combination(532,23));
		
		Interface1 i1 = new MyClass();
		System.out.println(i1.combination(42,25));
		
		Interface2 i2 = new MyClass();
	    i2.m3();
		
		((MyClass)i2).m2(12);
		
		i2.hashCode();	
		
		
	}

}