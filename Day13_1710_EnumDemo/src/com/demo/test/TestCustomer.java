package com.demo.test;

import com.demo.beans.Customer;
import com.demo.enums.Gender;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c = new Customer(11,"raj",Gender.male);
		
		Customer c1 = new Customer(12,"rohit",Gender.male); 
		
		Gender g = Gender.male;
		
		System.out.println("ordinal of g is "+ g.ordinal());
		
		System.out.println("the value of "+ g.valueOf("male"));

	}

}
