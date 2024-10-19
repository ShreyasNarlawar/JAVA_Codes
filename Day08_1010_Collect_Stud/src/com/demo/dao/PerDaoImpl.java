package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public class PerDaoImpl implements  PersonDao{

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delStudent(byte dlt) {
		// TODO Auto-generated method stub
		return false ;
	}

	@Override
	public boolean updMarks(int sid, int newmarks) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searById(int sid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> searByName(String sname) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Student> searByMarks(int mks) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> sortById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> sortByMarks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
	}

}
