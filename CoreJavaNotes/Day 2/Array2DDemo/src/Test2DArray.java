import java.util.Scanner;

public class Test2DArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. accept data\n2. display data\n3. add all numbers\n4. Add rowwise\n");
			System.out.println("5. add columnwise\n 6. find maximum\n 7. find minimum\n 8. find minimim row wise\n");
			System.out.println("9. find minimum column wise\n10. exit\nchoice: ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					Array2DService.acceptData(arr);
					break;
				case 2:
					Array2DService.displayData(arr);
					break;
				case 3:
					int sum = Array2DService.addAllNumbers(arr);
					System.out.println("Sum of all values: " + sum);
					break;
				case 4:
					int[] sumarr = Array2DService.addrowwise(arr);
					for (int i = 0; i < sumarr.length; i++) {
						System.out.println("Sum of row " + i + ":  " + sumarr[i]);
					}
					break;
				case 5:
					sumarr = Array2DService.addcolumnswise(arr);
					for (int i = 0; i < arr[0].length; i++) {
						System.out.println("Sum of row " + i + ":  " + sumarr[i]);
					}
					break;
				case 10:
					System.out.println("Thank you for visiting....");
					// System.gc();
					// System.exit(0);
				default:
					System.out.println("wrong choice....");
			}
		} while (choice != 10);

	}

}
