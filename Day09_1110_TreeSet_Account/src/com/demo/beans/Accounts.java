package com.demo.beans;

abstract public class Accounts implements Comparable<Accounts>{
	
	static int cnt;
	
	static {
		cnt = 1;
	}
	private String accId;
	private String aname;
	private int pin;
	private String Que;
	private String ans;
	protected double balance;
	
	public int hashCode() {
		System.out.println("In Hashcode of Account "+aname+"---->"+pin);
		return aname.hashCode()+pin;
	}
	public boolean equals(Object obj) {
		Accounts ac = (Accounts) obj;
		System.out.println("In Account Equals :"+aname+"---->"+pin+"---->"+ac.aname+"---->"+ac.pin);
		return this.aname.equals(ac.aname)&&this.pin==ac.pin;
	}
	
	public Accounts(String type) {
		super();
		this.accId=generatedId(type,null);
		// TODO Auto-generated constructor stub
	}
	private String generatedId(String type,String aname) {
		String id =null;
		if(aname!=null) {
			id = type+aname.substring(0, 2)+cnt; 
		}
		else
			id=type+"xx"+cnt;
		cnt++;
		return id;
	}
	public Accounts(String type, String aname, int pin, String que, String ans, double balance) {
		super();
		this.accId = generatedId(type,aname);
		this.aname = aname;
		this.pin = pin;
		this.Que = que;
		this.ans = ans;
		this.balance = balance;
	}
	
	
	public static int getcnt() {
		return cnt;
	}
	public static void setcnt(int cnt) {
		Accounts.cnt = cnt;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getQue() {
		return Que;
	}
	public void setQue(String que) {
		this.Que = que;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts [accId=" + accId + ", aname=" + aname + ", pin=" + pin + ", Que=" + Que + ", ans=" + ans
				+ ", balance=" + balance + "]";
	}
	abstract public int withDraw(double amt);
	public void deposit(double amt) {balance+=amt;}
	public int compareTo(Accounts ob) {System.out.println("InCompareTo Account : "+this.accId+"---->"+ob.accId);
	return this.accId.compareTo(ob.accId);
	}
	
}
