package com.demo.dao;

import java.util.Set;

import com.demo.beans.Accounts;

public interface AccountDao {

	Set<Accounts> findAll();
	boolean saveaccount(Accounts acc);
	Accounts findById(String acid, int pin);
	Accounts getById(String daccId);
	boolean removeAccount(String accId, int pin);
	}
