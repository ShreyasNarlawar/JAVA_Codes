package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.demo.Exception.WrongInputException;

public class GuessByNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mynum=23;
		for(int i=1;i<4;i++) {
			
		try {
			System.out.println("ENter the Number :");
			int num = sc.nextInt();
			if(num != mynum)
				throw new WrongInputException("Ooops Wrong Number Entered...");
			else
				System.out.println("Great..You Guessed Correct Number..");
			break;
			
		}catch(WrongInputException e){
			System.out.println(e.getMessage());
		}catch(InputMismatchException a) {
			System.out.println(a.getMessage());
		}finally {
			System.out.println("End End");
		}
		}
	}

}
