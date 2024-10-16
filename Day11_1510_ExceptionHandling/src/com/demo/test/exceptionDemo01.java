package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionDemo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			try{
				System.out.println("Enter number 1 :");
				int val1 = sc.nextInt();
				System.out.println("Enter number 2 :");
				int val2 = sc.nextInt();
				
				int ans = val1 + val2 ;
				System.out.println("Addition is "+ ans);
				
				ans = val1/val2;
				System.out.println("Division is "+ ans);
				break;
				
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e) {
				System.err.println("ENter Number...");
			}
			finally {
				System.out.println("End of Program..");
				sc.next();
				
			}
		}
	}
}
