package com.demo.beans;

public class myClass {
	
	public void printTable(int n) {
		
		for(int i = 1; i < 11; i++) {
		System.out.println(n + "*"+ i +"----->"+n*i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int factorial(int n) {
		int f = 1;
		for(int i = 1; i<= n; i++) {
			f = f *i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return f;
	}
	
	public int sumDigit(int n) {
		int sum = 0;
		while(n >0) {
			int d = n % 10;
			n = (int)n/10;
			sum =sum +d;
		}
		return sum;
	}
}
