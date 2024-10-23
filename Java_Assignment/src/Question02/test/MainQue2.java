package Question02.test;

import java.util.Scanner;

import Question02.services.FriendServices;

public class MainQue2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int ch = 0;
		do {
		System.out.println("Menu");
		System.out.println("1.Display all \n2.Search by id\n3.Search by Name");
		System.out.println("4.Display all with particular hobby \n5.exit \n6.Add new Friend");
		ch = sc.nextInt();
		
		switch(ch) {
		
		case 1 :
			 FriendServices.displayAll();
			 break;
		case 2:
			System.out.println("Enter id to search");
			int id = sc.nextInt();
			boolean status = FriendServices.searchById(id);
			if(status)
				System.out.println("Friend found on id "+id);
			else
				System.out.println("Id not found");
			break;
		case 3:
			System.out.println("Enter name to search");
			String name = sc.next();
			boolean flag = FriendServices.searchByName(name);
			if(flag)
				System.out.println("friend name is found");
			else
				System.out.println("Friend name is not found");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		}while(ch != 6);
	}

}
