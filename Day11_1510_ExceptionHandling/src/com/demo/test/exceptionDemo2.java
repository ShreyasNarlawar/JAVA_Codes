package com.demo.test;

public class exceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
			try {
				
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("ENd of Code..");
			}
		}
}