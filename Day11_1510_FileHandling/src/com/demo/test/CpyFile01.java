package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CpyFile01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		fis = new FileInputStream("demotxt1.txt");
		
		fos = new FileOutputStream("democpytxt1.txt");
		
		int c = fis.read();
		
		while(c !=null) {
			
		}
		

	}

}
