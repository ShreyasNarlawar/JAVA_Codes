package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;

public interface EmployeeDao {

	public void save(Employee e);

	public void readFileData(String fname);

	public boolean deleteEmployeeById(int id) throws EmployeeNotFound;

	public List<Employee> getAll();

	public boolean updateById(int id, double sal) throws EmployeeNotFound;

	public void writeFileData(String fname) throws EmployeeNotFound;
}
