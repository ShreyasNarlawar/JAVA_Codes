package com.demo.services;

import java.util.List;
import java.util.Scanner;


import com.demo.beans.Employee;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.exceptions.EmployeeNotFound;
import com.demo.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeServices {
	
	private EmployeeDao edao ;
	
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);
	@Override
	public void addEmployeeDetails() {
		System.out.println("Enter id ");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Salary");
		double sal = sc.nextDouble();
		System.out.println("Enter bonus");
		double bonus = sc.nextDouble();
		
		Employee e = new Employee(id, name, sal, bonus);
		
		edao.save(e);
		
	}

	@Override
	public void readFile(String fname) {
		
		edao.readFileData(fname);
		
	}

	@Override
	public boolean removeEmployeeById(int id) throws EmployeeNotFound{
		
		return edao.deleteEmployeeById(id);
	}

	@Override
	public List<Employee> displayAll() {
		return edao.getAll();
		
	}

	@Override
	public boolean updateEmployeeById(int id,double sal) throws EmployeeNotFound{
		// TODO Auto-generated method stub
		return edao.updateById(id,sal);
	}

	@Override
	public void writeFile(String fname) {
		try {
			edao.writeFileData(fname);
		} catch (EmployeeNotFound e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
