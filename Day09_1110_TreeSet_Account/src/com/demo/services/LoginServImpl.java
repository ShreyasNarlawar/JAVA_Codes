package com.demo.services;

public class LoginServImpl implements LoginServ {

	@Override
	public String authenticate(String uname, String pass) {
		if(uname.equals("user") && pass.equals("user123") ) {
			return "User";	
		}
		else if(uname.equals("admin") && pass.equals("admin123")) {
			return "admin";
		}
		else {
			return null;
		}
	}
	

}
