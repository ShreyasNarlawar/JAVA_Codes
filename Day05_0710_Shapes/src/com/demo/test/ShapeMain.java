package com.demo.test;

import java.util.Scanner;

import com.demo.beans.*;
import com.demo.services.ShapeServices;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch=0;
			for(int i = 0; i < 3;i++) {
				System.out.println("1.Triangle \n2.Circle\n3.Rectangle\nChoice: ");
				ch = sc.nextInt();
				ShapeServices.acceptData(ch);
			}
				for(int i = 0; i < 3; i++) {
				ShapeServices.calculateDetails(i);
			}
				int cntTria = 0, cntCir=0, cntRect = 0;
				Shape[] sarr = ShapeServices.getAllShapes();
				for(int i = 0 ;i<sarr.length;i++) {
					if(sarr[i]  instanceof Triangle)
						cntTria++;
					else if(sarr[i] instanceof Circle)
						cntCir++;
					else if(sarr[i] instanceof Rectangle)
						cntRect++;
				}
				
			System.out.println("The Triangle Count is :"+cntTria);
			System.out.println("The Circle Count is :"+cntCir);
			System.out.println("The Rectangle Count is :"+cntRect);
			sc.close();
	}
}
