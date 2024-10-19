package com.demo.threads;

import com.demo.beans.myClass;

public class FactorialThread extends Thread{
	
	private myClass obj;
	private int n;
	public FactorialThread(myClass obj, int n) {
		super();
		this.obj = obj;
		this.n = n;
	}
	
	public void run() {
		int ans = obj.factorial(n);
		System.out.println("The answer is "+ans);
	}

}
