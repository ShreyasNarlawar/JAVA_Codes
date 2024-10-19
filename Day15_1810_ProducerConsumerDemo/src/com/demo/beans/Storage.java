package com.demo.beans;

public class Storage {
	private int a;
	private boolean valueset;
	public Storage() {
		super();
		valueset=false;
	}
	synchronized public void put(int x) {
		if(valueset) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("In Get "+a);
		valueset=false;
		notify();
	}
	synchronized public void get() {
		if(!valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("in get "+a); //consumer functionality
		valueset=false;
		notify();
	}	

}