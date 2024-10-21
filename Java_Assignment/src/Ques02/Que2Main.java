package Ques02;

import java.util.Scanner;

public class Que2Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		Question02[] stud = new Question02[2];
		for(int i=0;i<2;i++) {
			
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
			
			stud[i]= new Question02(id,name,m1,m2,m3);
	
		}
    System.out.println("\n----Student Details----");
    for (Question02 s : stud) {
        System.out.println(s);
    }
	}
}
