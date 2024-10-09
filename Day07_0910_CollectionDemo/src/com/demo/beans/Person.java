package com.demo.beans;

import java.time.LocalDate;

public class Person {
	
	private int pid;
	private String pname;
	private String address;
	private LocalDate dob;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int pid, String pname, String address, LocalDate dob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.dob = dob;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + ", dob=" + dob + "]";
	}
	
	

}
