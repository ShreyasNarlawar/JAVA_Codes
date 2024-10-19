package com.demo.services;

import java.util.List;
import com.demo.beans.Student;

public interface PersonServ {

void addStudent(byte chh);
	
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

	void addStudent(Student s);

}
