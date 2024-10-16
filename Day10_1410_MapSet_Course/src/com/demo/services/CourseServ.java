package com.demo.services;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface CourseServ{

	boolean addNewCourse();

	boolean removeCourse(String course);

	boolean updateCourse(String cname, int capacity, int duration);

	Map<String, Course> showAllCourse();

	List<Course> ShowCourse(String cname);

	List<Course> ShowDuration(int duration);

	Map<String, Course> ArrangeByName();

	List<Course> ArrangeByDuration();



}
