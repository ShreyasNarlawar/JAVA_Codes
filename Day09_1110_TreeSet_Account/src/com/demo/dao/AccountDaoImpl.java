package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Accounts;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;

public class AccountDaoImpl implements AccountDao{
	static Set<Accounts> accset;
	static{
		accset = new HashSet<>();
		accset.add(new SavingAccount("shreyas",1745,"Fav Animal?","Dog",224561,7474));
		accset.add(new CurrentAccount("shyaam",7445,"Fav Food?","Vadapaav",745471,104));
		accset.add(new SavingAccount("sanaa",3547,"Fav Color?","Pink",2989745,32));
		Accounts.setcnt(4);
		}
	public Set<Accounts> findAll() {
		// TODO Auto-generated method stub
		return accset;
	}

	@Override
	public boolean saveaccount(Accounts acc) {
		// TODO Auto-generated method stub
		accset.add(acc);
		return false;
	}
	public Accounts findById(String acid, int pin) {
		for(Accounts acc:accset) {
			if(acc.getAccId().equals(acid) && acc.getPin()==pin) {
				return acc;
			}
		}
		return null;
	}
	public Accounts getById(String acid) {
		for(Accounts acc:accset) {
			if(acc.getAccId().equals(acid) ) {
				return acc;
			}
		}
		return null;
	}
	public boolean removeAccount(String acid, int pin) {
		Accounts acc=findById(acid, pin);
		return accset.remove(acc);
	}
	public Set<Accounts> sortById() {
		TreeSet<Accounts> ts=new TreeSet<>();
		for(Accounts acc:accset) {
			ts.add(acc);
		}
		return ts;
	}
	public List<Accounts> sortByName() {
		Comparator<Accounts> c=(ar1,ar2)->{
			System.out.println("In Comparator Method");
			return ar1.getAname().compareTo(ar2.getAname());};
			List<Accounts> lst=new ArrayList<>(accset.size());
			for(Accounts acc:accset) {
				lst.add(acc);
			}
			lst.sort(c);
			return lst;
		}
}
