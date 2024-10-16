package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashmapTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>hm = new HashMap<>();
		hm.put("DAC", 239);
		hm.put("DBDA", 50);
		hm.put("DTISS", 100);
		
		Set<String> s =  hm.keySet();
		
		for(String s1 : s) {
			System.out.println("The value of key"+s1 + "--->"+ hm.get(s1));
		}
		
		Set<Map.Entry<String, Integer>> es = hm.entrySet();
		
		for(Map.Entry<String, Integer> m : es) {
			System.out.println(m + "---->"+m.getValue());
		}
		
		for(String s2 : s) {
			if(hm.get(s2) > 62) {
				System.out.println("The courses contains more than 62 participants are" + hm.get(s2));
			}
		}
		
		System.out.println("To check existing DBDA in HashMap"+ hm.containsKey("DBDA"));
		
		if(!hm.containsKey("DBDA"))
			  System.out.println(hm.put("DBDA", 150));
		else
			System.out.println("Duplicate key");
		
		hm.remove("DBDA");
		
		
	}

}
