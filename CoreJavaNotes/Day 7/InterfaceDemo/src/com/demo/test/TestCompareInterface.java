package com.demo.test;

import com.demo.interfaces.CompareInt;
import com.demo.interfaces.CompareString;

public class TestCompareInterface {

	public static void main(String[] args) {
		CompareInt c1=(a,b)->{
				return a>b?a:b;
		};
		int ans=c1.findMax(12,34);
		System.out.println("Max is : "+ans);
		CompareString c2=(s1,s2)->{
			return s1.length()>s2.length()?s1:s2;
		};
		String s=c2.findMax("Hello", "Welcome");
		System.out.println("Max length String : "+s);

	}

}
