package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.demo.beans.MyTask;

public class TestExcutorServ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(5);
		List<Future<Integer>>lst = new ArrayList<>();
		for(int i=1;i<=91;i=i+10) {
			Future<Integer> f = es.submit(new MyTask(i,i+9));
			lst.add(f);
		}
		int sum=0;
		for(Future<Integer>f1:lst) {
			try {sum=sum+f1.get();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(ExecutionException e) {
			e.printStackTrace();
		}
	}
		System.out.println("Addition :"+sum);
		es.shutdown();
	}
}
