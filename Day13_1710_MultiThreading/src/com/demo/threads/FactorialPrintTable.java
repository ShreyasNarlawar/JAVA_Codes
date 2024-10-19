package com.demo.threads;

import com.demo.beans.myClass;

public class FactorialPrintTable extends Thread{
	
	 private myClass obj;
	 int n ;
	 
	 
	public FactorialPrintTable(myClass obj, int n) {
		super();
		this.obj = obj;
		this.n = n;
	}
	 
	
	public void run() {
		obj.printTable(n);
	}

}
