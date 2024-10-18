package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CpyFile01 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			
			fis = new FileInputStream("demotxt1.txt");
			
			fos = new FileOutputStream("democpytxt1.txt");
			
			int c = fis.read();
			
			while(c != -1) {
				fos.write(c);
				c = fis.read();
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				 fis.close();
				 fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
