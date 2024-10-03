
import java.util.*;

class Numbers01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i =0; i < 10; i++) {
			int n = sc.nextInt();
			
			sum = sum + n;
		}
		System.out.println("Sum of 10 numbers is :"+sum);
	}
}
