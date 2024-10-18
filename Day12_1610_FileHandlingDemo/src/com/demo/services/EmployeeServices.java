package com.demo.services;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;

public interface EmployeeServices {

	void addEmployeeDetails();

	void readFile(String string);

	boolean removeEmployeeById(int id) throws EmployeeNotFound;

	List<Employee> displayAll();

	boolean updateEmployeeById(int id,double sal)throws EmployeeNotFound;

	void writeFile(String string);

}
