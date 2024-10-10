package com.demo.beans;

import java.time.LocalDate;

public class Faculty extends Person {
	private int age;
	private int exp;
	public Faculty() {
		super();
	}
	public Faculty(int pid, String pname, String addr, LocalDate dob, int age, int exp) {
		super(pid,pname,addr,dob);
		this.age = age;
		this.exp = exp;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return super.toString()+"Faculty [ age=" + age + ", exp=" + exp + "]";
	}
	
	
}
