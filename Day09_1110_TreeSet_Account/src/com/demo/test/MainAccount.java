package com.demo.test;

import java.util.Scanner;

import com.demo.dao.LoginServ;
import com.demo.services.AccServ;
import com.demo.services.AccServImpl;
import com.demo.services.LoginServImpl;

public class MainAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccServ acserv= new AccServImpl();
		LoginServ lgserv= new LoginServImpl();
		
		System.out.println("Enter Username :");
		String uname = sc.next();
		System.out.println("Enter Password :");
		String pass = sc.next();
		String roll = LoginServ.authenticate(uname,pass);
		int choice=0;
		if(roll.equals("User")) {
			do {
				System.out.println("1.Open new Account \n 2.Withdraw amount\n 3.Deposit Amount\n4.Transfer Money");
				System.out.println("5.Change Pin\n6.Check Balance\n7.Close Account\n8.Display All\n9.Exit");
				System.out.println("\n\tChoice:");
				choice = sc.nextInt();
			switch(choice) {	
			case 1->{
				System.out.println("1.Saving Account\n2.Current Account");
				System.out.println("\n\tChoice:");
				int chh=sc.nextInt();
				boolean status = AccServ.addNewAccount(chh);
				if(status) {
					System.out.println("Account Created SuccessFully..");
				}else
					System.err.println("Error Occured while Opening!!!");
			}
			case 2->{
				System.out.println("Enter Account Id :");
				String acid = sc.next();
				System.out.println("Enter PinCode :");
				int pin = sc.nextInt();
				System.out.println("ENter amount for Withdraw :");
				double amt = sc.nextDouble();
				int a = acserv.withdrawAmount(acid,pin,amt);
				if(a == 1)
					System.out.println("Money WithDrawal Done..");
				else if(a==2)
					System.out.println("Insufficient Balance..");
				else 
					System.err.println("Invalid Credentials.!!");
			}
			case 3->{
				System.out.println("Enter Account Id :");
				String acid = sc.next();
				System.out.println("Enter PinCode :");
				int pin = sc.nextInt();
				System.out.println("ENter amount for Deposit :");
				double amt = sc.nextDouble();
				boolean a = acserv.depositAmount(acid,pin,amt);
				if(a)
					System.out.println("Money Deposited Done..");
				else
					System.err.println("Invalid Credentials.!!");
			}
		}
		}while(choice!=9);
		}
	}

}
