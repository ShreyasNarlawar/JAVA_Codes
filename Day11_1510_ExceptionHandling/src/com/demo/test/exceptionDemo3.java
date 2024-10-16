package com.demo.test;

import java.util.Scanner;

public class exceptionDemo3 {
	public static int division(int a , int b) {
		try{
			int d = a/b;
			return d;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			throw e;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("ENter val1 & val2 : ");
			int val1 = sc.nextInt();
			int val2 = sc.nextInt();
			int ans = division(val1,val2);
			System.out.println(ans);
		}
		catch(ArithmeticException e){
			System.out.println("Number1 Cannot Divide By zero..");
		}
	}
}
