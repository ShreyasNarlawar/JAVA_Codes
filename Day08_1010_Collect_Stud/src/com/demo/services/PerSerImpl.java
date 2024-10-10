package com.demo.services;

import java.util.List;

import com.demo.beans.Student;
import com.demo.dao.PerDaoImpl;
import com.demo.dao.PersonDao;

public class PerSerImpl implements PersonServ{

	private PersonDao pdao;
	
	public PerSerImpl() {
		super();
		pdao=new PerDaoImpl();
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student delStudent(byte dlt) {
		// TODO Auto-generated method stub
		return pdao.delStudent(dlt);
	}

	@Override
	public boolean updMarks(int sid, int newmarks) {
		// TODO Auto-generated method stub
		return pdao.updMarks(sid, newmarks);
	}

	@Override
	public boolean searById(int sid) {
		// TODO Auto-generated method stub
		return pdao.searById(sid);
	}

	@Override
	public List<Student> searByName(String sname) {
		// TODO Auto-generated method stub
		return pdao.searByName(sname);
	}

	@Override
	public List<Student> searByMarks(int mks) {
		// TODO Auto-generated method stub
		return pdao.searByMarks(mks);
	}
	
	@Override
	public List<Student> sortById() {
		// TODO Auto-generated method stub
		return pdao.sortById();
	}

	@Override
	public List<Student> sortByName() {
		// TODO Auto-generated method stub
		return pdao.sortByName();
	}

	@Override
	public List<Student> sortByMarks() {
		// TODO Auto-generated method stub
		return pdao.sortByMarks();
	}
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return pdao.getAllStudents();
	}
}
