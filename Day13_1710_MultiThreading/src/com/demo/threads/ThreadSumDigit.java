package com.demo.threads;

import com.demo.beans.myClass;

public class ThreadSumDigit extends Thread{
	
	private myClass obj;
	int n;
	
	
	public ThreadSumDigit(myClass obj, int n) {
		super();
		this.obj = obj;
		this.n = n;
	}
	
	public void run() {
		int result =obj.sumDigit(n);
		System.out.println(result);
	}

}
