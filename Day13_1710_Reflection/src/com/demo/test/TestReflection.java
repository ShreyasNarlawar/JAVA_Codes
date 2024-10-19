package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

import com.demo.beans.Course;

public class TestReflection {

	public static void main(String[] args) {
		
		Course c = new Course("DAC",4589.67,50,200);
		
		Class cls = c.getClass();
		
		Constructor[] carr = cls.getConstructors();
		
		for(Constructor c1 : carr) {
			System.out.println(c1.getParameterCount());
		}
		
		Method[] met = cls.getMethods();
		Method mm = null;
		for(Method m1 : met) {
			if(m1.getName().equals("m2")) {
				mm = m1;
				System.out.println(m1.getName());
				System.out.println(m1.getParameterCount());
			}
		}

		
		try {
			mm.invoke(c,12);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		Field[] fld = cls.getDeclaredFields();
		
		for(Field f : fld) {
			if(f.getName().equals("cname")) 
				f.setAccessible(true);
				System.out.println(f.getName());
			
		}
		try {
			Field f = cls.getDeclaredField("cname");
			System.out.println("Before changing the name");
			System.out.println(c);
			f.setAccessible(true);
			try {
				f.set(c, "ram");
				
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			System.out.println("After changing the name");
			System.out.println(c);
			
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
