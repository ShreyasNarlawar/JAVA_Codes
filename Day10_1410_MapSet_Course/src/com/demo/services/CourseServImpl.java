package com.demo.services;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Course;
import com.demo.dao.Coursedao;
import com.demo.dao.CoursedaoImpl;

public class CourseServImpl implements CourseServ{
	
	private  Coursedao cdao;
	
	public CourseServImpl() {
		cdao = new CoursedaoImpl();
	}
	
	static Scanner sc = new Scanner (System.in);

	@Override
	public boolean addNewCourse() {
		System.out.println("Enter the course name : ");
		String cname = sc.next();
		System.out.println("Enter course fees : ");
		double fees = sc.nextDouble();
		System.out.println("Enter course Duration: ");
		int duration = sc.nextInt();
		System.out.println("Enter student capacity: ");
		int capacity = sc.nextInt();
		
		Course c= new Course(cname, fees, capacity,duration); 
		
		return cdao.save(c);
		
	}

	@Override
	public boolean removeCourse(String cname) {
		return cdao.deleteCourse(cname);
	}


	@Override
	public boolean updateCourse(String cname, int capacity, int duration) {
		return cdao.modifyCourse(cname,capacity,duration);
	}

	@Override
	public Map<String,Course> showAllCourse() {
		return cdao.showAllCourses();
		
	}


	@Override
	public List<Course> ShowCourse(String cname) {
		// TODO Auto-generated method stub
		return cdao.showByCname(cname);
	}

	@Override
	public List<Course> ShowDuration(int duration) {
		return cdao.showByDuration(duration);
	}

	@Override
	public Map<String, Course> ArrangeByName() {
		// TODO Auto-generated method stub
		return cdao.sortByName();
	}

	@Override
	public List<Course> ArrangeByDuration() {
		return cdao.sortByDuration();
	}

}
