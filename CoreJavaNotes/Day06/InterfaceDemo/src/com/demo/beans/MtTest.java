package com.demo.beans;

import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class MtTest implements I1,I2{

	@Override
	public void m1() {
		
		I1.super.m1();
		I2.super.m1();
		System.out.println("in m1 MtTest");
	}

	@Override
	public void m2() {
		System.out.println("in m2 in MtTest");
		
	}

	@Override
	public void m31() {
		System.out.println("in m31 in MtTest");
		
	}

	

}
