package com.demo.services;

import java.util.Set;

import com.demo.beans.Accounts;

public interface AccServ{

	public  boolean addNewAccount(int chh);
	
	Set<Accounts>getAll();
	
	public int withdrawAmount(String acid, int pin, double amt);

	public boolean depositAmount(String acid, int pin, double amt);

	public boolean transferfunds(String acid,int pin,String RaccId,double amt);

	public boolean changePinByOldpin(String accId, int pin, int npin);

	public boolean changePinByQnA(String accId);

	public void checkBalance(String accId);

	public boolean closeAccount(String accId, int pin);

}
