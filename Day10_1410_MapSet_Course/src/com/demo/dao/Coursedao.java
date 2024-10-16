package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface Coursedao {

	boolean save(Course c);

	boolean deleteCourse(String cname);

	boolean modifyCourse(String cname, int capacity, int duration);

	Map<String, Course> showAllCourses();

	List<Course> showByCname(String cname);

	List<Course> showByDuration(int duration);

	Map<String, Course> sortByName();

	List<Course> sortByDuration();

}
