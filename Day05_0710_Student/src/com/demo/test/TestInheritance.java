package com.demo.test;
import  java.util.Scanner;

import com.demo.services.PersonServices;

public class TestInheritance {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);		
		int ch=0;
		
		do {
			System.err.println("\tMenu\n\t-----");
			System.out.println("1.Add New Student \n2.Delete Student \n3.Faculty ");
			System.out.println("4.Display all Graduate students \n5.Display all Master students \n6. Find Grade");
			System.out.println("7.Display All\n8.Exit\n\t Choice :");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("1.Graduate Students\n2.Master Students\n3.Faculty\n\tChoice:");
				int chh=sc.nextInt();
				PersonServices.addData(chh);
			}
		}while(ch!=4);
		
	}

}
