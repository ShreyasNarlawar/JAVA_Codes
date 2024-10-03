import java.util.Scanner;

class ArmStrongNum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();

	isArmStrong(t);
     }

public static void isArmStrong(int n){
	
	int ncpy = n;

	int sum = 0;

	while(n != 0){
	   int temp = n % 10;
 	   sum = sum * 10 + temp; 
	    n = n/10;
       }

	if(ncpy == sum){
 		System.out.println("Given number is ArmStrong Number");
	}else{
		System.out.println("Given number is ArmStrong Number");
 	}
}
}