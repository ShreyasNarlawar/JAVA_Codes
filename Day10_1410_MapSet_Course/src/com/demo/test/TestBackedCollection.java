package com.demo.test;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestBackedCollection {

	public static void main(String[] args) {
		
		TreeSet<Integer> tm = new TreeSet<>();
		
		tm.add(10);
		tm.add(150);
		tm.add(398);
		tm.add(64);
		tm.add(77);
		
		System.out.println("The value of tree set are"+ tm);
		
		SortedSet<Integer> hs = tm.headSet(15);
		
		SortedSet<Integer> ts = tm.tailSet(15);
		
		System.out.println(hs);
		
		System.out.println(ts);
		
		tm.add(65);
		
		tm.add(45);
		
		tm.add(345);
		
		System.out.println(hs);
		
		System.out.println(ts);
		
	}

}
