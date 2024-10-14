package com.demo.beans;

public class CurrentAccount extends Accounts {
	private static float int_rate;
	private static float min_bal;
	private int min_trans;
	static {
		int_rate=0.6f;
		min_bal=0f;
	}
	
	public CurrentAccount(String aname,int pin,String Que,String Ans,double balance, int min_trans) {
		super("c",aname,pin,Que,Ans,balance);
		this.min_trans = min_trans;
	}

	public static float getMin_bal() {
		return min_bal;
	}

	public static void setMin_bal(float min_bal) {
		CurrentAccount.min_bal = min_bal;
	}

	public int getMin_trans() {
		return min_trans;
	}

	public void setMin_trans(int min_trans) {
		this.min_trans = min_trans;
	}

	public static float getInt_rate() {
		return int_rate;
	}

	public static void setInt_rate(float int_rate) {
		CurrentAccount.int_rate = int_rate;
	}

	@Override
	public int compareTo(Accounts o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return super.toString()+"CurrentAccount [min_trans=" + min_trans + "]";
	}

	@Override
	public int withDraw(double amt) {
		// TODO Auto-generated method stub
		if(balance-amt>=min_bal) {
			balance-=amt;
			return 1;
		}
		return 2;
	}

}
