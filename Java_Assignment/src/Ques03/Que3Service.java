package Ques03;

import java.util.Scanner;

public class Que3Service {
	static Scanner sc = new Scanner(System.in);
	static Question03[] stud=new Question03[10];
	static int cnt=1;
	
	public static void addDetails() {
		
			System.out.println("----Enter Student Details----");
			System.out.println("Enter Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter Marks for subject 01 : ");
			int m1 = sc.nextInt();
			System.out.println("Enter Marks for subject 02 : ");
			int m2 = sc.nextInt();
			System.out.println("Enter Marks for subject 03 : ");
			int m3 = sc.nextInt();
			
			stud[cnt]= new Question03(id,name,m1,m2,m3);
			cnt++;
			
	}
	public static void searchbyid(int id) {
		for(int i = 0 ; i<stud.length;i++) {
		if(stud[i].getStudid() == id && stud[i] != null)
			System.out.println(stud[i]);
			else
			System.out.println("Id invalid..");
		}
	}
	public static void searchByName(String name) {
			for(int i=0;i<stud.length;i++)
				if(stud[i].getName().equals(name))
					System.out.println("Student Name is found");
				else
					System.out.println("Student Not Found");
	}
	public static void calculateGpa(int id) {
		for(int i=0;i<stud.length;i++) {
			float tot = (1/3)*stud[i].getM1()+(1/2)*stud[i].getM2()+(1/4)*stud[i].getM3();
			System.out.println("The Total GPA of "+id+" is : "+tot);
		}
	}
	public static void displayDetails() {
		// TODO Auto-generated method stub
		for(int i=0;i<stud.length;i++) {
			if(stud[i]!=null)
			System.out.println(stud[i]);
			else {
				System.out.println("Student not Added..");
				break;
			}
		}
	}
}