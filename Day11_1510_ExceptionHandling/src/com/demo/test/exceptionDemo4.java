package com.demo.test;

import java.util.Scanner;

public class exceptionDemo4 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("ENter val1 & val2 : ");
				int val1 = sc.nextInt();
				int val2 = sc.nextInt();
				if(val2!=0) {
				System.out.println(val1/val2);
				}
				else
					throw new ArithmeticException("Value Cannot be Divide by zero..");
			}
			catch(ArithmeticException e){
				System.out.println("Number1 Cannot Divide By zero..");
			}
		}
}
