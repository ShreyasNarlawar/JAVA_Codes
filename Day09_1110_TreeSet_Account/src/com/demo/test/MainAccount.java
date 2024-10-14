package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Accounts;
import com.demo.services.AccServ;
import com.demo.services.AccServImpl;
import com.demo.services.LoginServ;
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
		String roll = lgserv.authenticate(uname,pass);
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
				boolean status = acserv.addNewAccount(chh);
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
			case 4->{
				System.out.println("Enter Account Id of Sender  : ");
				String accId = sc.next();
				System.out.println("ENter pin :");
				int pin = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Account Id of Receiver: ");
				String RaccId = sc.next();
				System.out.println("Enter Amount to Send :");
				double amt = sc.nextDouble();

				boolean reaction = acserv.transferfunds(accId,pin,RaccId,amt);
				if(reaction) {
					System.out.println("transfer is done.");
				}else {
					System.err.println("transfer is failed.");
				}
			}
			case 5->{
				System.out.println("Enter Account Id for Change Pin :");
				String accId=sc.next();
				System.out.println("\t1.Change Pin through Old Pin?\n\t2.Forgot Pin?\n\t\tChoice :");
				int chhh = sc.nextInt();
				if(chhh == 1) {
					System.out.println("Enter Old pin :");
					int pin=sc.nextInt();
					System.out.println("Enter New Pin :");
					int npin=sc.nextInt();
					boolean status = acserv.changePinByOldpin(accId,pin,npin);
					
					if(status)
						System.out.println("Pin Changed Successfully..");
					else
						System.err.println("Invalid Credentials..");
				}
				else if(chhh == 2) {
				
					boolean status= acserv.changePinByQnA(accId);
					if(status)
						System.out.println("Pin Changed Successfully..");
					else
						System.err.println("Invalid Credentials..");
				}else
					System.err.println("Invalid Choice..");
			}
			case 6->{
				System.out.println("Enter Account Id for Check Balance :");
				String accId = sc.next();
				acserv.checkBalance(accId);
			}
			case 7->{
				System.out.println("Enter Account Id for Close Account :");
				String accId = sc.next();
				System.out.println("Enter Pin :");
				int pin=sc.nextInt();
				boolean status =acserv.closeAccount(accId,pin);
				if(status) {
					System.out.println("Account Removed Successfully..");
				}else
					System.err.println("Invalid Credentials..");
			}
			case 8->{
				Set<Accounts> sac=acserv.getAll();
				sac.stream().forEach(System.out::println);
			}
			case 9->{
				System.out.println("Thanks You for Visiting..");
			}
		}
		}while(choice!=9);
		}
	}

}
