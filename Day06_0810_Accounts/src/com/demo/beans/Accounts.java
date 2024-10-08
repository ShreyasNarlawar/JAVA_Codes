package com.demo.beans;

public class Accounts {
	private int accId;
	private double balance;
	private String name;
	private int pin;
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(int accId, double balance, String name, int pin) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.name = name;
		this.pin = pin;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Accounts [accId=" + accId + ", balance=" + balance + ", name=" + name + ", pin=" + pin + "]";
	}
	
	public void deposit(double amt) {
		this.balance = balance + amt;
	}
	public boolean withdraw(double amt) {
		if(balance-amt>=10000) {
			this.balance = balance - amt;
			return true;
		}
		else
			return false;
	}
}
