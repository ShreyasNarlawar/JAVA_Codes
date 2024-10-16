package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Course;
import com.demo.services.CourseServ;
import com.demo.services.CourseServImpl;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CourseServ cserv = new CourseServImpl();
		int choice=0;
		
		do {
			System.out.println("\t Course Menu");
			System.out.println("1.Add new Course\n2.Delete Course\n3.Update Course capacity and Duration \n4.SHow all Courses\n "
					+ "5.Show by Name\n6.Show by Duration\n7.Arrange by Name \n8.Arrange by Duration\n9.Exit\n\tChoice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1 ->{
				boolean status = cserv.addNewCourse();
				if(status) {
					System.out.println("New Course is Added Successfully");
				}else {
					System.out.println("Error");
				}
			}
			case 2 ->{
				System.out.println("Enter course to delete");
				String cname = sc.next();
				
				boolean status = cserv.removeCourse(cname);
				if(status) {
					System.out.println("Course deleted Successfully");
				}else {
					System.out.println("Not Found");
				}
			}
			case 3 ->{
				System.out.println("Enter course name to modify");
				String cname = sc.next();
				System.out.println("Enter the capacity to modify");
				int capacity = sc.nextInt();
				System.out.println("Enter duration to modify");
				int duration = sc.nextInt();
				
				boolean status = cserv.updateCourse(cname, capacity,duration);
				if(status)
					System.out.println("Course updated Successfully.");
				else
					System.out.println("Invalid Credentials..");
			}
			case 4 ->{
				Map<String,Course> hm1=cserv.showAllCourse();
				Set<String> s=hm1.keySet();
				s.stream().forEach(ob->System.out.println(ob+"-->"+hm1.get(ob)));	
			}
			case 5 ->{
				System.out.println("Enter Course name");
				String cname = sc.next();
				List<Course> lst = cserv.ShowCourse(cname);
				if(lst != null)
					lst.forEach(System.out::println);
				else
					System.out.println("Not Found..");
			}
			case 6 ->{
				System.out.println("Enter Course Duration");
				int duration = sc.nextInt();
				List<Course> list = cserv.ShowDuration(duration);
				if(list != null)
					list.forEach(System.out::println);
				else
					System.out.println("Not Found..");
			}
			case 7 ->{
				Map<String,Course> sort = cserv.ArrangeByName();
				Set<String> s = sort.keySet();
				s.stream().forEach(c -> System.out.println(c +"--->"+sort.get(c)));
				
			}
			case 8 ->{
				List <Course> list2 = cserv.ArrangeByDuration();
				list2.stream().forEach(c1->System.out.println(c1));
			}
			case 9 ->{
				System.out.println("Thank You for visiting.....");
			}
			default ->{
				System.out.println("Invalid Input");
			}
		  }
		}while(choice!=9);
	}

}
