package com.demo.test;

import java.util.Scanner;

import com.demo.beans.myClass;
import com.demo.threads.FactorialPrintTable;

public class TestMyClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		myClass m = new myClass();
		System.out.println("Enter value for print table: ");
		int num = sc.nextInt();
		FactorialPrintTable pt = new FactorialPrintTable(m,num);
		
		pt.start();
	
		try {
			pt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
