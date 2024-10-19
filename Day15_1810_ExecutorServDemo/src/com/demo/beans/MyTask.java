package com.demo.beans;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer>{
	private int Start;
	private int end;
	public MyTask(int start, int end) {
		super();
		Start = start;
		this.end = end;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=Start;i<=end;i++) {
			sum=sum+i;
		}
		System.out.println(Thread.currentThread().getId()+"--->"+Start+"--->"+end+"="+sum);
		return sum;
	}
}
