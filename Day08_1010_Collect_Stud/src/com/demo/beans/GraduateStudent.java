package com.demo.beans;

import java.time.LocalDate;

public class GraduateStudent extends Student {
	
	private int spsub;

	public GraduateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GraduateStudent(int pid, String pname, String addr, LocalDate dob, int []marks,int spsub) {
		super( pid,  pname,  addr, dob, marks);
		this.spsub = spsub;
	}

	public int getSpsub() {
		return spsub;
	}

	public void setSpsub(int spsub) {
		this.spsub = spsub;
	}

	@Override
	public String toString() {
		return super.toString()+"GraduateStudent [spsub=" + spsub + "]";
	}
	
	

	
	

}
