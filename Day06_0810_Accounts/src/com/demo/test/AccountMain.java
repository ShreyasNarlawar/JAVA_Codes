package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Accounts;
import com.demo.services.AccSerIntImpl;
import com.demo.services.AccSerInterface;

public class AccountMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		AccSerInterface asi = new AccSerIntImpl();
		do {
			System.out.println("1.Add new Account\n2.Delete Existing Account\n3.Withdraw Money\n4.Deposit Money");
			System.out.println("5.Check Balance\n6.Display all accounts\n7.Exit \n Choice :");
			choice = sc.nextInt();
			
			switch(choice) {
					case 1:
							asi.addnewAccount();
							break;
					case 2:
							System.out.println("Enter Account Id for Delete :");
							int id = sc.nextInt();
							System.out.println("Enter Account Pin for Delete :");
							int pin  = sc.nextInt();
							int status=asi.deleteById(id, pin);
							if(status>0)
								System.out.println("Account Closed...");
							else if(status==-1)
								System.out.println("Account not Found...");
							else
								System.out.println("Wrong Pincode...");
							break;
					case 3:
							System.out.println("Enter Account Id :");
							id = sc.nextInt();
							System.out.println("Enter Account Pin :");
							pin  = sc.nextInt();
							System.out.println("Enter Amount for Deposit :");
							double amt = sc.nextDouble();
							double state = asi.depositAmt(id, pin, amt);
							if(state>0)
								System.out.println(amt+"Rs. Deposited in Account number:"+id);
							else
								System.out.println("Not Deposited Due to Technical Issue..");
							break;
					case 4:
							System.out.println("Enter Account Id :");
							id = sc.nextInt();
							System.out.println("Enter Account Pin :");
							pin  = sc.nextInt();
							System.out.println("Enter Amount for Withdraw :");
							amt = sc.nextDouble();
						
							double check = asi.withdrawAmt(id, pin, amt);
							if(check>0)
								System.out.println("Money Retrieved Successfully...");
							else if(check==-3)
								System.out.println("Account not Found...");
							else
								System.out.println("Wrong Pincode...");
							break;
					case 5:
						System.out.println("Enter Account Id :");
						id = sc.nextInt();
						System.out.println("Enter Account Pin :");
						pin  = sc.nextInt();
						
						check = asi.findBalance(id, pin);
						
						if(check >0) {
							System.out.println("Balance is :"+ check);
						}
						else if(check == -1) {
					       System.out.println("Not Found...");
						}
						break;
					case 6:
						Accounts [] arr = asi.findAll();
						
						for(Accounts a : arr) {
							if(a != null) {
								System.out.println(a);
							}else {
								break;
							}
						}
						break;
					case 7:
						System.out.println("Thanks For Visiting....");
						sc.close();
						break;
					default:
						System.out.println("Wrong Choice ......");
					    break;
				}	
			}while(choice != 7);			
	}
}
