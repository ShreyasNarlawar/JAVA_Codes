package com.demo.beans;

public class ThreadDemo extends Thread{
	public void run() {
		for(int i =0 ;i<10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("In runnable..");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		ThreadDemo t1 = new ThreadDemo();
		t1.start();		
		for(int i =0 ;i<10;i++) {
			Thread.sleep(2000);
			System.out.println("Hellllo from Main..");
		}
	}
}
