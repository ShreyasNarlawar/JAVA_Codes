package com.demo.test;

public class StringTest02 {
	public static void main(String[] args) {
		String s1 = "Shreyas";
		System.out.println(s1);
		System.out.println(s1.concat("Narlawar"));
		System.out.println(s1.replace('e', 'E'));
		
		StringBuilder sb = new StringBuilder("HElllo");
		sb.append(" Duniyaaaaa");
		System.out.println(sb);

		s1="aaaa,bbbb,cccc-ssss";
		String arr[] = s1.split(",");
		String s2="How are you?";
		String s3=s2.join("&", arr);
		System.out.println(s3);
	}
}
