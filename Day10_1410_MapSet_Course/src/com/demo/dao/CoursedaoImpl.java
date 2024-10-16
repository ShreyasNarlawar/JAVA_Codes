package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.Course;

public class CoursedaoImpl implements Coursedao{
	
	
	static Map<String,Course>hm;
	
	static {
		hm = new HashMap<>();
		hm.put("DAC", new Course("DAC",100000.34,200,300));
		hm.put("DBDA", new Course("DBDA",120000.74,150,500));
		
	}
	

	@Override
	public boolean save(Course c) {
		Course c1 = hm.putIfAbsent(c.getCname(), c); 
		if(c1 == null)
			return true;
		else
			return false;
	}


	@Override
	public boolean deleteCourse(String cname) {
		Course c1 = hm.remove(cname);
		if(c1 != null)
			return true;
		else
			return false;
	}


	@Override
	public boolean modifyCourse(String cname, int capacity, int duration) {
		Course c1 = hm.get(cname);
		
		if(c1 != null) {
			c1.setCapacity(capacity);
			c1.setDuration(duration);
			return true;
		}
		return false;
	}


	@Override
	public Map<String,Course> showAllCourses() {
		
		return hm;
	}


	@Override
	public List<Course> showByCname(String cname) {
		Set<String> s=hm.keySet();
		List<Course> clst=new ArrayList<>();
		for(String s1:s) {
			Course c=hm.get(s1);
			if(c.getCname().equals(cname)) {
				clst.add(c);
			}		
		}
		if(clst.size()>0) {	
			return clst;
		}
		
		return null;
	}


	@Override
	public List<Course> showByDuration(int duration) {
		Set<String> s1 =  hm.keySet();
		List<Course> dlst = new ArrayList<>();
		for(String s2 : s1) {
			Course c1 = hm.get(s2);
			if(c1.getDuration()> duration) {
				dlst.add(c1);
			}
		}
		if(dlst.size()>0) {	
			return dlst;
		}
		return null;
	}


	@Override
	public Map<String, Course> sortByName() {
		Map<String, Course> tm = new TreeMap<>();
		Set<String> s1 = hm.keySet();
		
		for(String s : s1) {
			tm.put(s, hm.get(s));
		}
		return tm;
	}


	@Override
	public List<Course> sortByDuration() {
		List<Course> lst = new ArrayList<>();
		Comparator<Course> c= (c1,c2) ->{
			System.out.println("in comparator");
			return c1.getDuration() - c2.getDuration();};
			
			Set<String> s1 = hm.keySet();
			
			for(String course : s1) {
			    lst.add(hm.get(course));
			}
		lst.sort(c);
		return lst;
	}		
}
