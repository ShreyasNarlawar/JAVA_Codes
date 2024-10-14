package com.demo.services;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Accounts;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;

public  class AccServImpl implements AccServ {
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
			return false;
	}
	public Set<Accounts>getAll(){
		return accdao.findAll();
	}
	@Override
	public int withdrawAmount(String acid, int pin, double amt) {
		// TODO Auto-generated method stub
		Accounts acc = accdao.findById(acid,pin);
		if(acc != null)
			return acc.withDraw(amt);
		else
			return 3;
	}
	@Override
	public boolean depositAmount(String acid, int pin, double amt) {
		Accounts acc = accdao.findById(acid,pin);
		if(acc != null) {
			acc.deposit(amt);
			return true;
		}else
			return false;
	}

	@Override
	public boolean transferfunds(String acid, int pin, String RaccId, double amt) {
		Accounts acc = accdao.findById(acid, pin);
		Accounts dacc = accdao.getById(RaccId);
		if(acc != null) {
			dacc.deposit(amt);
			return true;
		}
		return false;
	}

	@Override
	public boolean changePinByOldpin(String accId, int pin,int npin) {
		Accounts acc = accdao.findById(accId, pin);
		if(acc != null) {
			acc.setPin(npin);
			return true;
		}
		return false;
	}

	@Override
	public boolean changePinByQnA(String accId) {
		Accounts acc = accdao.getById(accId);
		if(acc != null) {
			System.out.println(acc.getQue());
			String anss = sc.next();
			if(acc.getAns().equals(anss)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void checkBalance(String accId) {
		Accounts acc = accdao.getById(accId);
		if(acc != null) {
			System.out.println("Account Balance is :"+acc.getBalance());
		}else
			System.err.println("Invalid Credentials..");
	}

	@Override
	public boolean closeAccount(String accId,int pin) {
		// TODO Auto-generated method stub
		
		if(accdao.removeAccount(accId,pin)) {
			return true;
		}
		return false;
	}
}