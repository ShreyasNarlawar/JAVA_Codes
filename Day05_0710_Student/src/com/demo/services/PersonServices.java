package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Student;

public class PersonServices {
	static Scanner sc = new Scanner(System.in);
	static Student [] sarr;
	static int cnt;
	
	static {
		sarr[0] = new GraduateStudent(1,"shreyas","Deccan",LocalDate.of(2024,12,24),new int[] {89,90},88);
		sarr[1] = new GraduateStudent(2,"amit","ShivajiNagar",LocalDate.of(2023, 5, 23),new int[] {78,89},67);
		sarr[2] = new MasterStudent(3,"YASH","band garden",LocalDate.of(2022,8,2),new int[] {66,99},"bio","MBBS",95);
		
		cnt = 3;
	}
	
	public static void addData(int ch) {
		System.out.println("Enter Student Id :");
		int id = sc.nextInt();
		System.out.println("Enter Student Name :");
		sc.next();
		String sname = sc.nextLine();
		System.out.println("Enter Address :");
		String addr=sc.nextLine();
		System.out.println("Enter Date of Birth (dd/mm/yyyy):");
		String db = sc.nextLine(); 
		LocalDate dob = LocalDate.parse(db,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		if(ch==1 || ch==2) {
			int[]mks = new int[2];
			System.out.println("ENter Subject 1 marks :");
			mks[0] = sc.nextInt();

			System.out.println("ENter Subject 2 marks :");
			mks[1] = sc.nextInt();
			
			if(ch==1) {
				System.out.println("Enter Special Subject Marks :");
				int spSubMks = sc.nextInt();
				sarr[cnt]=new GraduateStudent(id, sname, addr, dob, mks, spSubMks);
			}else if(ch==2){
				System.out.println("Enter Thesis Subject :");
				String thesissub = sc.nextLine();
				System.out.println("Enter Thesis Marks :");
				int thesismks =sc.nextInt();
				System.out.println("Enter Graduation Degree :");
				String degree = sc.nextLine();
				sarr[cnt]=new MasterStudent(id, sname, addr, dob, mks, thesissub, degree, thesismks);
			}
			else {
				System.out.println("Enter Name :");
				String fname = sc.nextLine();
				System.out.println("Enter Your Age :");
				int age = sc.nextInt();
				System.out.println("Enter Experience :");
				int exp = sc.nextInt();
			}
		}
		
	}
	
	

}
