package Array1d;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array: ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		int ch;
		do {
			System.out.println("\tMenu");
			System.out.println("\t----");
			System.out.println("1.Accept Numbers\n2.Display Array Numbers\n3.Search in Array\n4.Add Even Elements\n5.Display Prime Numbers");
			System.out.println("Enter Choice.");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				ArrayServices.Accept(arr);
				break;
			case 2:
				ArrayServices.displayData(arr);
				break;
			case 3:
				System.out.println("Enter The Number to Search :");
				int search=sc.nextInt();
				int a =ArrayServices.searchData(arr,search);
				if(a==100)
					System.out.println("Element Not Found in an Array..");
				else
					System.out.println("Element Found in an Array..and its Index is :"+a);
				break;
			case 4:
				ArrayServices.addAllEvenNum(arr);
				break;
			case 5:
				 int[] primearr=ArrayServices.allPrimeNum(arr);
				 if (primearr.length > 0) {
					    System.out.println("Prime Numbers are:");
					    for (int n : primearr) {
					        System.out.println(n);
					    }
					} else {
					    System.out.println("No prime numbers found.");
					}
					break;
					default:
					    System.err.println("!!..Inappropriate Choice..!!");
					}
					} while (ch != 5);

	}
}
