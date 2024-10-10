package com.demo.test;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import java.time.LocalDate;
public class TestInheritance {
public static void main(String[] args) {

		// Student s=new Student(12,"xxx","pune",LocalDate.of(2000, 04, 27),new
		// int[]{12,34});
		// System.out.pritlnn(s);
		GraduateStudent g = new GraduateStudent(12, "xxx", "pune", LocalDate.of(2000, 04, 27), new int[] { 12, 34 },
				89);
		System.out.println(g);
		// static polymorphism
		System.out.println("Grade: " + g.calculateGrade());
		MasterStudent m = new MasterStudent(12, "xxx", "pune", LocalDate.of(2000, 04, 27), new int[] { 12, 34 }, "yyyy",
				"BSC", 89);
		System.out.println(m);
		// static polymorphism
		System.out.println("Grade: " + m.calculateGrade());
	// 	public static float findGrade(int id) {
	// 		for(Student s:sarr) {
	// 			if(s!=null) {
	// 				if(s.getPid()==id) {
	// 					//dynamic polymorphism
	// 					float mks=s.calculateGrade();
	// 					return mks;
	// 				}
	// 			}else {
	// 				break;
	// 			}
	// 		}
	// 		return -1;
	// 	}
	// }
	}
}
