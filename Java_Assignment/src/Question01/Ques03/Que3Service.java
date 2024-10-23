package Question01.Ques03;

import java.util.Scanner;

public class Que3Service {
	static Scanner sc = new Scanner(System.in);
	static Question03[] stud=new Question03[10];
	static int cnt=0;
	
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
			System.out.println("Student Added Successfully..");
			
	}
	public static void searchbyid(int id) {
		for(int i = 0 ; i<cnt;i++) {
		if(stud[i].getStudid() == id && stud[i] != null)
			System.out.println(stud[i]);
			else
			System.out.println("Id invalid..");
		break;
		}
	}
	public static void searchByName(String name) {
			for(int i=0;i<cnt;i++) {
				if(stud[i].getName().equals(name)) {
					System.out.println("Student Name is found");
					System.out.println(stud[i]);
				}
				else
					System.out.println("Student Not Found");
			break;
			}
	}
	public static void calculateGpa(int id) {
		float a =0.0f,b = 0.0f,c=0.0f;
		for(int i=0;i<cnt;i++) {
			if(stud[i].getStudid() == id) {
				 a = (0.33f)*(stud[i].getM1());
			     b = (0.5f) *(stud[i].getM2());
			     c = (0.25f)*(stud[i].getM3());
			     
			     float result = a+b+c;
			     System.out.println("GPA is "+ result);
			}else
				System.out.println("Invalid id");
		}
	}
	public static void displayDetails() {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++) {
			if(stud[i]!=null)
			System.out.println(stud[i]);
			else {
				System.out.println("Student not Added..");
				break;
			}
		}
	}
}