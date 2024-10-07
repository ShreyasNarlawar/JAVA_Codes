package com.demo.services;

public interface Interface1 {
	
	void m1();
	int m2(int c);
	
	private int factorial(int n) {
		int f = 1;
		for(int i = 2; i<n;i++ ) {
			f=  f*i;
		}
		return f;
	}

	
	default int permutations(int n, int r ) {
		System.out.println("The permutations are");
		
		int y =factorial(n)/factorial(n-r);
		return y;
	}
	
	default int combination(int n, int r) {
		System.out.println("The Combination are");
		int x = factorial(n)/(factorial(n-r)*factorial(r));
		return x;
	}
	
	public static void m2() {
		System.out.println("Inside m2 method in interface");
	}
}
