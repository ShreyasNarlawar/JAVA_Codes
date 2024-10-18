package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyAppend {

	public static void main(String[] args) {
		
		
		FileOutputStream fos = null;
		
		File f = new File("testcopyappend.txt");
		
		try {
			if(f.exists()) {
					fos = new FileOutputStream(f,true);
			}else{
				fos = new FileOutputStream(f);
			}
		}catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
		try(FileInputStream fis = new FileInputStream("testappend.txt");
				FileOutputStream fos1 = fos;){
			int c = fis.read();
			while( c != -1) {
			     fos1.write(c);
			     c= fis.read();
			}
			System.out.println("File is copied");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
