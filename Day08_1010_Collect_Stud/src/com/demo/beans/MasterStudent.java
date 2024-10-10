package com.demo.beans;

import java.time.LocalDate;

public class MasterStudent extends Student {
	
	private String thesissub,degree;
	private int thesismarks;
	public MasterStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MasterStudent(int pid, String pname, String addr, LocalDate dob, int[] marks,String thesissub,String degree,int thesismarks) {
		super(pid, pname, addr, dob, marks);
		
		this.thesismarks = thesismarks;
		this.thesissub = thesissub;
		this.degree = degree;
	}
	public String getThesissub() {
		return thesissub;
	}
	public void setThesissub(String thesissub) {
		this.thesissub = thesissub;
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
		return super.toString()+"MasterStudent [thesissub=" + thesissub + ", degree=" + degree + ", thesismarks=" + thesismarks + "]";
	}
	
	

}
