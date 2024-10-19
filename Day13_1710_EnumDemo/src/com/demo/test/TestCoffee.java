package com.demo.test;

import com.demo.enums.Coffee;

public class TestCoffee {

	public static void main(String[] args) {
		
		
		
		Coffee cd = Coffee.less; 
		
		System.out.println("Display Menu");
		
		
		switch(cd) {
		case less :
			System.out.println("less is selected");
			break;
		case more :
			System.out.println("more is selected");
			break;
		case extra :
			System.out.println("extra is selected");
			break;
		}
		

	}

}
