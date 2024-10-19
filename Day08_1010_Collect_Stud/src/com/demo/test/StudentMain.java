package com.demo.test;

import java.util.Scanner;

import com.demo.services.PerSerImpl;
import com.demo.services.PersonServ;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonServ pserv=new PerSerImpl();
		byte ch = 0;
		do {
			System.err.println("\tMENU\n\t-----");
			
			System.out.println("1.Add new Student\n2.Delete Student\n3.Modify Student Marks \n4.Search By ID");
			System.out.println("5.Search By Name\n6.Sort By Id\n7.Sort By Name\n8.Search By Marks>Given Marks");
			System.out.println("9.Display all Details\n10.Search by name and Display in sorted Order\n11.Exit");
			System.out.println("ENTER CHoice :");
			ch=sc.nextByte();
			
			switch(ch) {
			case 1->{
				System.out.println("1.Graduate Student");
				System.out.println("2.Master's Student");
				System.out.println("3.Faculty \n\t Choice :");
				byte chh=sc.nextByte();
				pserv.addStudent(chh);
			}
			case 2->{
				System.out.println("Enter Id for Delete Student :");
				byte dlt=sc.nextByte();
				boolean status = pserv.delStudent(dlt);
				if(status)
					System.out.println("Student Removed SuccessFully");
				else
					System.err.println("Invalid Id..!!");
			}
			case 3->{
				System.out.println("Enter Id for update Marks :");
				int sid = sc.nextInt();
				System.out.println("Enter new Marks");
				int mks = sc.nextInt();
				pserv.updMarks(sid, mks);
			}
			case 4->{
				System.out.println("Enter Id for Search :");
				int sid = sc.nextInt();
				pserv.searById(sid);
			}
			case 5->{
				System.out.println("Enter Name for Search :");
				String sname = sc.nextLine();
				pserv.searByName(sname);
			}
//			case 6->{
//				pserv.sortById();
//			}
//			case 7->{
//				pserv.sortByName();
//			}
			case 8->{
				pserv.sortByMarks();
			}
			case 9->{
				pserv.displayAll();
			}
//			case 10->{
//				pserv.sortByName();
//			}
			}
		}while(ch!=11);
	}
}