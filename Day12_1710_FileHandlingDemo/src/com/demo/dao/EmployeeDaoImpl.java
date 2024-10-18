package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;

public class EmployeeDaoImpl implements EmployeeDao {
	
	Scanner sc = new Scanner(System.in);

	static List<Employee> lst;
	
	static {
		lst = new ArrayList<>();
	}
	@Override
	public void readFileData(String fname) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));){
			
			while(true) {
				Employee e = (Employee) ois.readObject();
				lst.add(e);
			} 
		}catch(EOFException e) {
			System.out.println("reached to end of the file...."+lst.size());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void save(Employee e) {
		lst.add(e);
	}

	@Override
	public List<Employee> getAll() {
		return lst;
	}

	@Override
	public boolean deleteEmployeeById(int id) throws EmployeeNotFound {
		boolean flag = lst.remove(new Employee(id));
		if(flag)
				return flag;
	throw new EmployeeNotFound("File not Found"+id);
	}

	@Override
	public boolean updateById(int id, double sal)throws EmployeeNotFound {
		int pos = lst.indexOf(new Employee(id));
		if(pos != -1) {
			Employee e = lst.get(pos);
		    e.setSal(pos);
		    return true;
		}
		throw new EmployeeNotFound("Updation failed try again with correct Details.");
	}

	@Override
	public void writeFileData(String fname){
		
		try(ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(fname));){
			
			for(Employee e : lst) {
				ops.writeObject(e);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	

	


	

}
