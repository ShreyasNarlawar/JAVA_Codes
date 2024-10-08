package com.demo.test;

import com.demo.beans.C;
import com.demo.beans.MyClass;
import com.demo.interfaces.CompareInter;
import com.demo.interfaces.MyInterface;
import com.demo.interfaces.addInterface;

public class MainGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface <C> ob =(x)->{
			System.out.println(x);
		};
		ob.display(new C(1,2,3));
		MyClass<Integer> o = new MyClass<>(11);
		MyClass<String> s = new MyClass<>("WELCOME");
		
		CompareInter<Integer> d = (a,b)->{
			return a>b ? a:b;
		};
		CompareInter<String> d1 = (a,b)->{
		 	return a.length()>b.length()? a:b ;
		};
		
		addInterface<Integer,String> e = (x,y)->{
			return x.length()+y.length();
		};
		
		addInterface<Integer,Integer> r = (c,i)->{
			return c +i;
		};
		
		
		System.out.println("find max integer : "+ d.findMax(3,5));
		System.out.println("find max string  : "+ d1.findMax("Welcome","Shreyas"));
		System.out.println("Addition of integers : "+ r.add(4,45));
		System.out.println("find max Strings : "+ e.add("Hello","Hi"));

		
		
		
		
	}

}
