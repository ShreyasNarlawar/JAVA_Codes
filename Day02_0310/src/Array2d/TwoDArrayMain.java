package Array2d;

import java.util.Scanner;

public class TwoDArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[3][3];
		int ch;
		do {
			System.out.println("\tMenu\n\t----");
			System.out.println("1.Accept Data\n2.Display Data\n3.Add all Numbers\n4.Add Rowwise\n5.Add Columnwise");
			System.out.println("6.Find Maximum in Array\n7.Find Minimum in Array \n8.Find Min Rowwise");
			System.out.println("9.Find Min Columnwise\n10.Exit");
			System.out.print("\n\tEnter Choice:\n\t----- -------");
			ch = sc.nextInt();
				switch(ch) {
				case 1:
					TwoDArrayServices.aceeptData(arr);
					break;
				case 2:
					TwoDArrayServices.displayData(arr);
					break;
				case 3:
					TwoDArrayServices.addAllNum(arr);
					break;
				case 4:
					TwoDArrayServices.addRowWise(arr);
					break;
				case 5:
					TwoDArrayServices.addColumnWise(arr);
					break;
				case 6:
					TwoDArrayServices.findMaximum(arr);
					break;
				case 7:
					TwoDArrayServices.findMinimum(arr);
					break;
				case 8:
					TwoDArrayServices.findMinRowWise(arr);
					break;
				case 9:
					TwoDArrayServices.findMinColumnWise(arr);
					break;
				case 10:
					System.out.println("Thanks For Visiting....!");
					sc.close();
					break;
				default:
					System.out.println("InAppropriate Choice..");
				}
			}while(ch!=10);
	}

}
