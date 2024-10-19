package com.demo.test;

import java.util.Scanner;

import com.demo.beans.myClass;
import com.demo.threads.ThreadSumDigit;

public class TestMyClass3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		myClass m = new myClass();
		System.out.println("Enter value for sum of entered digit: ");
		int num = sc.nextInt();
		ThreadSumDigit tsd = new ThreadSumDigit(m,num);
		
		tsd.start();
	
		try {
			tsd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		sc.close();
	}

}
