package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;

abstract class Student extends Person{
	
	protected int[] marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int pid, String pname, String address, LocalDate dob, int[] marks) {
		super(pid, pname, address, dob);
		// TODO Auto-generated constructor stub
		
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return super.toString()+"Student [marks=" + Arrays.toString(marks) + "]";
	}
	
	
	
	
	
	

}
