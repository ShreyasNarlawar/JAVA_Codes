package com.demo.beans;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private double bonus;
	
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, double sal, double bonus) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.bonus = bonus;
	}
	
	
	public Employee(int id) {
		super();
		this.empid = id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", bonus=" + bonus + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("In Employee Equals Method "+this.empid+"---->"+((Employee)obj).empid);	
		return this.empid==((Employee)obj).empid;
	}
	
	
	

}
