package com.demo.test;

import java.util.Vector;

public class TestVector {
	
	public static void main(String [] args) {
		
		Vector<Integer> v = new Vector(10,20);
		
		System.out.println("Default capacity of vector is  "+v.capacity());
		
		v.add(23);
		v.add(56);
		v.add(30);
		
		
		System.out.println(v);
		
		System.out.println("size of vector v is "+ v.size());
		
		
		for(int i = 0; i < 10; i++) {
			v.add(i+20);
		}
		
		System.out.println(v);
		
		System.out.println("New Capacity after adding values is "+v.capacity());
		
		System.out.println("New size of vector v is "+ v.size());
		
		v.remove(new Integer(56));
		
		System.out.println("After Removing "+v);
		
		System.out.println("final size of vector v is "+ v.size());
	}

}
