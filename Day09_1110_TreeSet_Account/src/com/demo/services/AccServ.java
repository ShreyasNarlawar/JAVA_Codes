package com.demo.services;

public interface AccServ{

	public static boolean addNewAccount(int chh) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int withdrawAmount(String acid, int pin, double amt);

	public boolean depositAmount(String acid, int pin, double amt);

}
