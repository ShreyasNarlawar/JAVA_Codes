package com.demo.services;

import com.demo.beans.Accounts;

public interface AccSerInterface {
	void addnewAccount();
	Accounts[] findAll();
	double findBalance(int id , int pin );
	double depositAmt(int id , int pin , double amt);
	double withdrawAmt(int id , int pin , double amt);
	int deleteById(int id , int pin);
}
