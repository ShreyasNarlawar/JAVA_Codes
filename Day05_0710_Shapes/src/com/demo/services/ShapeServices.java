package com.demo.services;

import java.util.Scanner;
import com.demo.beans.*;

public class ShapeServices {
	static Shape[] arr;
	static int cnt;
	static Scanner sc = new Scanner(System.in);
	
	static {
		arr = new Shape[3];
		cnt = 0;
	}
	public static void acceptData(int ch) {
		// TODO Auto-generated method stub
		System.out.println("Enter Color:");
		String color = sc.next();
		
		switch(ch) {
		case 1:
				System.out.println("Enter Base :");
				float base = sc.nextFloat();
				System.out.println("Enter Height :");
				float height = sc.nextFloat();
				System.out.println("Enter Side1 :");
				float side1 = sc.nextFloat();
				System.out.println("Enter Side2 :");
				float side2 = sc.nextFloat();
				arr[cnt]=new Triangle(color,base,height,side1,side2);
				break;
		case 2:
			System.out.println("Enter Radius :");
			float radius = sc.nextFloat();
			arr[cnt]=new Circle(color,radius);
			break;
		case 3:
			System.out.println("Enter Length :");
			float len = sc.nextFloat();
			System.out.println("Enter breadth :");
			float bread = sc.nextFloat();
			arr[cnt]=new Rectangle(color,len,bread);
			break;
		}
		cnt++;
	}

	public static void calculateDetails(int i) {
		// TODO Auto-generated method stub
		System.out.println(i+": Area      :"+arr[i].calc_Area());
		System.out.println(i+": Perimeter :"+arr[i].calc_Perimeter());
	}

	public static Shape[] getAllShapes() {
		// TODO Auto-generated method stub
		return arr;
	}
	
	

}
