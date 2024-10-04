package Array1d;

import java.util.Scanner;

public class ArrayServices {	
	public static void Accept(int[] arr) {
	Scanner sc = new Scanner(System.in);

		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+"th Number : ");
			arr[i]=sc.nextInt();
		}
	}
	public static void displayData(int []arr) {
		System.out.println("Index | Values");
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"     :  "+arr[i]);
		}
	}
	public static int searchData(int[] arr, int search) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return 100;
	
	}
	public static void addAllEvenNum(int[] arr) {
	// TODO Auto-generated method stub
		int sum=0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%2 == 0) {
				sum +=arr[i];
			}
		}
		System.out.println("The Addition of all Even Numbers in an Array is : "+sum);
	}
	public static int[] allPrimeNum(int[] arr) {
		int cnt=0;
		int []newarr = new int[arr.length];	
		for(int i = 0 ; i< arr.length;i++) {
			boolean val = isPrime(arr[i]);
			if(val) {
				newarr[cnt]=i;
				cnt++;
			}
			else
				return newarr;
		}
		return null;
	// TODO Auto-generated method stub
	
}
	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		for(int a =2 ;a < i; a++) {
			if(i % a == 0) {
				return false;
			}
		}
		return true;
	}
}
