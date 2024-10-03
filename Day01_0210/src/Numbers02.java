
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Numbers02 {

	public static void main(String[] args) throws IOException {
	
		//Using Buffered Reader here we are getting the input from the user..
		int sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The 5 Numbers :");
		for(int i = 1 ; i<=5 ; i++) {
			int num = Integer.parseInt( br.readLine());
			if(num % 3 == 0 || num % 5 == 0 || num % 11 == 0) {
				sum = sum + num;
			}
		}
		System.out.println("The Sum of Total Numbers which are Divisible by 3 , 5 & 11 are :"+sum);
	}
}
