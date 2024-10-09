package com.demo.test;

public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "Shreyas";
		String s2 = s1;
		String s3 = "Shreyas";
		String s4 = new String("Shreyas");
		
		System.out.println("s1==s2: "+(s1==s2));
		System.out.println("s1==s4: "+(s1==s4));
		System.out.println("s1==s4: "+(s1.equals(s4)));
	}
}
