package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(45);
		list.add(18);
		
		System.out.println("Index of 18"+list.indexOf(45));
		
		System.out.println("list contains"+list.contains(18));
		
		List <Integer> list1 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8,9);
		
//		list1.add(10);
		
		System.out.println(list1);
		
		list1.stream().forEach(System.out::println);
	}

}
