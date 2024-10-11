package com.demo.dao;

import java.util.Set;

import com.demo.beans.Accounts;

public interface AccountDao {

	Set<Accounts> findAll();
	boolean saveaccount(Accounts acc);
}
