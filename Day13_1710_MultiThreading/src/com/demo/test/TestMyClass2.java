package com.demo.test;

import java.util.Scanner;

import com.demo.beans.myClass;
import com.demo.threads.FactorialThread;

public class TestMyClass2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		myClass m = new myClass();
		System.out.println("Enter value for : ");
		int num = sc.nextInt();
		FactorialThread ft = new FactorialThread(m,num);
		
		ft.start();
	
		try {
			ft.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
