package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;
import com.demo.services.EmployeeServiceImpl;
import com.demo.services.EmployeeServices;

public class TestEmployeemgmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeServices eserv = new EmployeeServiceImpl();
		eserv.readFile("text1.dat");
		
		int choice = 0;
		
		do {
			System.out.println("1.Add New Employee \n2. Delete Employee \n3.Update Employee ");
			System.out.println("4.Display All Employee \n5.Exit \n Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1 ->{
				eserv.addEmployeeDetails();
			   }
			case 2 -> {
				try {
					System.out.println("Enter id to delete");
					int id = sc.nextInt();
					
					boolean status = eserv.removeEmployeeById(id);
					if(status) {
						System.out.println("Employee Deleted Successfully");
					}
				}catch(EmployeeNotFound e) {
					System.out.println(e.getMessage());
				}
			}
			case 3 ->{
				try {
					System.out.println("Enter id to update");
					int id = sc.nextInt();
					
					System.out.println("Enter salary to update");
					double sal = sc.nextDouble();
					
					boolean status = eserv.updateEmployeeById(id,sal);
					if(status) {
						System.out.println("Employee Updated Successfully");
					}
				}catch(EmployeeNotFound e) {
					System.out.println(e.getMessage());
				}
			}
			case 4 ->{
				List <Employee> list = eserv.displayAll();
				list.stream().forEach(System.out::println);
			}
			case 5 ->{
				eserv.writeFile("TextCopy1.dat");
				System.out.println("Thank you for visiting....");
				sc.close();
			}
			default ->{
				System.out.println("Wrong Input");
			}
		}
		
		}while(choice != 5);
}
}