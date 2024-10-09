package com.demo.test;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] myArr=new int[3][];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<myArr.length;i++) {
			System.out.println("Enter the Length for Column in row "+i);
			int t=sc.nextInt();
			myArr[i]=new int[t];
			for(int j=0;j<myArr[i].length;j++) {
				System.out.println("Enter Value for "+i+":"+j+ "=");
				myArr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<myArr.length;i++)
			for(int j=0;j<myArr[i].length;j++)
				System.out.println(i+" : "+j+" = "+myArr[i][j]);
	}

}
