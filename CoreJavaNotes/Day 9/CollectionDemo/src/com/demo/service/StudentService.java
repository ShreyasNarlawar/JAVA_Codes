package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	void addnewStudent(int ch);

	List<Student> getAllStudents();

	Student getById(int id);

	boolean deleteById(int id);

	boolean modifyStudentMarks(int id, int newmarks);

	List<Student> getByMarks(int mks);

	List<Student> getByName(String nm);

	List<Student> sortById();

	List<Student> sortByName();

	List<Student> sortByMarks();

}
