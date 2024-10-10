package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person {
	
	private int [] marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int pid, String pname, String addr, LocalDate dob, int []marks) {
		super(pid, pname, addr, dob);
		
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
