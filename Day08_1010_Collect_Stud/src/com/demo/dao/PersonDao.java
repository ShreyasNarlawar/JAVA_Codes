package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface PersonDao {
	void addStudent(Student s);
	
	List<Student> getAllStudents();

	boolean delStudent(byte dlt);

	boolean updMarks(int sid,int newmarks) ;

	boolean searById(int sid);

	List<Student> searByName(String sname);

	void displayAll();
	
	List<Student> searByMarks(int mks);

	List<Student> sortById();

	List<Student> sortByName();

	List<Student> sortByMarks();
}
