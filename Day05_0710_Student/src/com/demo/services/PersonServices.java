package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Faculty;
import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Student;

public class PersonServices {
	static Scanner sc = new Scanner(System.in);
	static Student [] sarr = new Student[25];
	static Faculty [] farr = new Faculty[23];
	static int scnt;
	static int fcnt;
	
	static {
		sarr[0] = new GraduateStudent(1,"shreyas","Deccan",LocalDate.of(2024,12,24),new int[] {89,90},88);
		sarr[1] = new GraduateStudent(2,"amit","ShivajiNagar",LocalDate.of(2023, 5, 23),new int[] {78,89},67);
		sarr[2] = new MasterStudent(3,"YASH","band garden",LocalDate.of(2022,8,2),new int[] {66,99},"bio","MBBS",95);
		farr[0] = new Faculty(1,"Arijit","Mumbai",LocalDate.of(1978,6,2),42,20);
		farr[1] = new Faculty(2,"PhysicsWallah","Pune",LocalDate.of(1979,11,2),31,10);
		scnt = 3;
		fcnt = 2;
	}
	
	public static void addData(int ch) {
		System.out.println("Enter Id :");
		int id = sc.nextInt();
		System.out.println("Enter Name :");
		sc.next();
		String name = sc.nextLine();
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
				sarr[scnt]=new GraduateStudent(id, name, addr, dob, mks, spSubMks);
				scnt++;
			}else if(ch==2){
				System.out.println("Enter Thesis Subject :");
				String thesissub = sc.nextLine();
				System.out.println("Enter Thesis Marks :");
				int thesismks =sc.nextInt();
				System.out.println("Enter Graduation Degree :");
				String degree = sc.nextLine();
				sarr[scnt]=new MasterStudent(id, name, addr, dob, mks, thesissub, degree, thesismks);
				scnt++;
			}
			else if(ch==3){
				System.out.println("Enter Your Age :");
				int age = sc.nextInt();
				System.out.println("Enter Experience :");
				int exp = sc.nextInt();
				farr[fcnt]=new Faculty(id,name,addr,dob,age,exp);
				fcnt++;
			}
		}
	}

	public static void deleteStudent(int dlt) {
	    for (int i = 0; i < scnt; i++) {
	        if (dlt == sarr[i].getPid()) {
	            for (int j = i; j < scnt - 1; j++) {
	                sarr[j] = sarr[j + 1];
	            }
	            sarr[scnt - 1] = null; 
	            scnt--; 
	            System.out.println("Deleted successfully");
	        }
	        else
	        	System.out.println("Student not found");
	    }
	}

	public static Faculty[] displayFaculty() {
		return farr;
	}

	public static Student[] displayGradStuds() {
		return sarr;
	}

	public static Student[] displayMastStuds() {
		return sarr;	
	}

	public static void findGrade(int grade) {
		
	}

	public static void displayAll() {
		for( Student p1:sarr) {
			if(p1 != null)
				System.out.println(p1);
	}
		for( Faculty f1:farr)
			if(f1 != null)
				System.out.println(f1);
	}
}
