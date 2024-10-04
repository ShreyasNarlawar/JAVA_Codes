package Array2d;

import java.util.Scanner;

public class TwoDArrayServices {
	public static void aceeptData(int[][] arr) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the Element for :"+i+", "+j+" Index : ");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void displayData(int[][] arr) {
		System.out.println("Entered Elements are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void addAllNum(int[][] arr) {
		int Add=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				Add=Add+arr[i][j];
			}
		}
		System.out.println("The Addition of All the Element is :"+Add);
	}

	public static void addRowWise(int[][] arr) {
		int rowwiseAdd[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				rowwiseAdd[i]=rowwiseAdd[i]+arr[i][j];
			}
		}
		for(int k=0;k<rowwiseAdd.length;k++)
		System.out.println("The Addition of Row "+k+" is : "+rowwiseAdd[k]);
	
	}

	public static void addColumnWise(int[][] arr) {
		int columnwiseAdd[] = new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				columnwiseAdd[i]=columnwiseAdd[i]+arr[j][i];
			}
		}
		for(int k=0;k<columnwiseAdd.length;k++)
		System.out.println("The Addition of Column "+k+" is : "+columnwiseAdd[k]);
	}

	public static void findMaximum(int[][] arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j])
				max=arr[i][j];
			}
		}
		System.out.println("The Maximum Number is an Array is : "+max);
	}

	public static void findMinimum(int[][] arr) {
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(min>arr[i][j])
				min=arr[i][j];
			}
		}
		System.out.println("The Minimum Number is an Array is : "+min);
	}	
		
	public static void findMinRowWise(int[][] arr) {
		int RowwiseMin[] = new int[arr.length];
		RowwiseMin[0]=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(RowwiseMin[i]>arr[i][j])
					RowwiseMin[i]=arr[i][j];
			}
		}
		for(int k=0;k<arr[0].length;k++)
			System.out.println("The minimum number of Row "+k+" is : "+RowwiseMin[k]);
	}

	public static void findMinColumnWise(int[][] arr) {
		int ColumnwiseMin[] = new int[arr[0].length];
		ColumnwiseMin[0]=arr[0][0];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(ColumnwiseMin[i]>arr[j][i])
					ColumnwiseMin[i]=arr[j][i];
			}
		}
		for(int k=0;k<arr[0].length;k++)
			System.out.println("The Minimum number of Column"+k+ "is :"+ColumnwiseMin[k]);
			
	}
}
	
