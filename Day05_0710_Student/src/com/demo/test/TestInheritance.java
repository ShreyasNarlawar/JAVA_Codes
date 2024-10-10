package com.demo.test;
import  java.util.Scanner;

import com.demo.beans.Faculty;
import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Student;
import com.demo.services.PersonServices;

public class TestInheritance {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);		
		int ch=0;
		
		do {
			System.err.println("\tMenu\n\t-----");
			System.out.println("1.Add New Student \n2.Delete Student \n3.Display Faculty ");
			System.out.println("4.Display all Graduate students \n5.Display all Master students \n6. Find Grade");
			System.out.println("7.Display All\n8.Exit\n\t Choice :");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("1.Graduate Students\n2.Master Students\n3.Faculty\n\tChoice:");
				int chh=sc.nextInt();
				if(chh>0&&chh<5)PersonServices.addData(chh);
				else System.err.println("Invalid Choice.");
				break;
			
			case 2:
				System.out.println("Enter Student Id for Delete : ");
				int dlt = sc.nextInt();
				PersonServices.deleteStudent(dlt);
				break;
			case 3:	
				Faculty[] farr = PersonServices.displayFaculty();
				for(Faculty a : farr) {
					if(a != null)
						System.out.println(a);
				}break;
			case 4:
				Student[]sarr=PersonServices.displayGradStuds();
				for(Student s :sarr) {
					if( s instanceof GraduateStudent)
						System.out.println(s);
				}break;
			case 5:
				sarr=PersonServices.displayMastStuds();
				for(Student s:sarr) {
					if(s instanceof MasterStudent)
						System.out.println(s);
				}break;
			case 6:
				System.out.println("Enter Student Id for grade : ");
				int grade = sc.nextInt();
				PersonServices.findGrade(grade);
				break;
			case 7:
				PersonServices.displayAll();
				break;
			case 8:
				System.out.println("Thanks for Visiting..");
				sc.close();
				break;
			default :
				System.err.println("Invalid Choice..!");
			}
		}while(ch!=8);
		
	}

}
