package com.demo.beans;

import java.time.LocalDate;

public class MasterStudent extends Student {
	
	private String thesis_sub, degree;
	private int thesismarks;
	
	
	public MasterStudent() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MasterStudent(int pid, String pname, String address, LocalDate dob, int[] marks,String thesis_sub, String degree, int thesismarks) {
		super(pid,pname, address, dob, marks);
		this.thesis_sub = thesis_sub;
		this.degree = degree;
		this.thesismarks = thesismarks;
	}


	public String getThesis_sub() {
		return thesis_sub;
	}


	public void setThesis_sub(String thesis_sub) {
		this.thesis_sub = thesis_sub;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public int getThesismarks() {
		return thesismarks;
	}


	public void setThesismarks(int thesismarks) {
		this.thesismarks = thesismarks;
	}


	@Override
	public String toString() {
		return super.toString()+"MasterStudent [thesis_sub=" + thesis_sub + ", degree=" + degree + ", thesismarks=" + thesismarks + "]";
	}
	
	
}
