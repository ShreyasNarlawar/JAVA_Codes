package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.beans.MyTestClass;
import com.demo.interfaces.Interface1;
import com.demo.interfaces.Intrerface2;
import com.demo.interfaces.MyFunctionalInterface;

public class TestInterface {
	public static void main(String[] args) {
		//using annonymous classes
		MyFunctionalInterface ob1=new MyFunctionalInterface() {
			public void m1() {
				System.out.println("In m1 in MyTestClass");
			}
			
		};
		//using lambda functions
		MyFunctionalInterface ob2=()->{
			System.out.println("In m1 in MyTestClass");
		};
		
		//using a class
		MyFunctionalInterface ob=new MyTestClass();
		ob.m1();
		int a=Intrerface2.i;
		//Intrerface2.i=45;
		//System.out.println(Intrerface2.i);
		MyClass ob5=new MyClass();
		ob5.combination(5, 2);
		Interface1 ob11=new MyClass();
		ob11.combination(4, 2);
		Intrerface2 ob21=new MyClass();
		ob21.m3();
		((MyClass)ob2).m2(12);
		ob2.hashCode();
		
	}

}
