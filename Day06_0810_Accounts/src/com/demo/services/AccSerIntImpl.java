package com.demo.services;

import java.util.Scanner;

import com.demo.beans.Accounts;

public class AccSerIntImpl implements AccSerInterface{

	static Accounts [] acArr;
	static int cnt;
	static {
		 acArr = new Accounts[10];
		 acArr[0]=new Accounts(245,65000.2,"Vardaan",4444);
		 acArr[1]=new Accounts(562,70457.32,"yeahbhai",7474);
		 cnt=2;
	}
	
	@Override
	public void addnewAccount() {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Account Id :");
			int accId = sc.nextInt();
			
			System.out.println("Enter Bank Balance :");
			double balance = sc.nextDouble();
			
			System.out.println("Enter Account Holder Name :");
			String name = sc.next();
			
			System.out.println("Enter Pincode :");
			int pin = sc.nextInt();
		
		acArr[cnt]=new Accounts(accId,balance,name,pin);
		cnt++;
	}

	@Override
	public Accounts[] findAll() {
		// TODO Auto-generated method stub
		
		return acArr;
	}
	private int findAccbyId(int id , int pin) {
		for(int i = 0 ; i < acArr.length;i++) {
			
			if(acArr[i].getAccId()==id) 
				if(acArr[i].getPin()==pin)
					return i;
				else 
					return -2;
		}
		return -1;
	}

	@Override
	public double findBalance(int id, int pin) {
		// TODO Auto-generated method stub
		int check = findAccbyId(id, pin);
		if(check>=0)
		return acArr[check].getBalance();
		else
			return check;
	}

	@Override
	public double depositAmt(int id, int pin, double amt) {
		// TODO Auto-generated method stub
		int check = findAccbyId(id, pin);
		if(check>=0)
			acArr[check].setBalance(amt);
		return check;
	}

	@Override
	public double withdrawAmt(int id, int pin, double amt) {
		// TODO Auto-generated method stub
		int check = findAccbyId(id, pin);
		if(check >= 0) {
			boolean Status = acArr[check].withdraw(amt);
			if(Status)
				return 1;
			else
				return -3;
		}
		return check;
	}

	@Override
	public int deleteById(int id, int pin) {
		// TODO Auto-generated method stub
		int check = findAccbyId(id, pin);
		if(check>=0)
			for(int i=0;i<cnt;i++)
				acArr[i] = acArr[i+1];
		return check;
	}
}
