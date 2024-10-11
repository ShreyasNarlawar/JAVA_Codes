package com.demo.services;

import java.util.Scanner;

import com.demo.beans.CurrentAccount;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;

public class AccServImpl implements AccServ {
	Scanner sc= new Scanner(System.in);
	private AccountDao accdao;
	public AccServImpl() {
		accdao = new AccountDaoImpl();
	}
	
	public boolean addNewAccount(int chh) {
		System.out.println("Enter name :");
		String nm = sc.next();
		System.out.println("Enter 4 digit Pin :");
		int pin = sc.nextInt();
		System.out.println("Enter Secret Question :");
		String sQue = sc.nextLine();
		System.out.println("Enter Answer of Question :");
		String sAns = sc.next();
		System.out.println("Enter Amount to Deposit :");
		double amt = sc.nextDouble();
		
			if(chh==1) {
				System.out.println("Enter Cheque Book Num :");
				int chequenum = sc.nextInt();
				Accounts acc = new SavingAccount(nm,pin,sQue,sAns,amt,chequenum);
				return accdao.saveaccount(acc);
			}else if(chh==2) {
				System.out.println("Enter Transaction Limit :");
				int tlimit = sc.nextInt();
				Accounts acc=new CurrentAccount(nm,pin,sQue,sAns,amt,tlimit);
				return accdao.saveaccount(acc);
			}
	}
	@Override
	public int withdrawAmount(String acid, int pin, double amt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean depositAmount(String acid, int pin, double amt) {
		// TODO Auto-generated method stub
		return false;
	}

}
