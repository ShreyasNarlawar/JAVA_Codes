import java.util.*;

class Palindrome{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to Check it is palindrome or Not..");

	int num =sc.nextInt();
	boolean val = isPalindrome(num);

	if(val)
		System.out.println("The Entered Number is Palindrome");
	else
		System.out.println("Entered Number is not an palindrome");

	sc.close();
	}

public static boolean isPalindrome(int n){
	int cpy = n;
	int rev=0;
	
	while(n!= 0){
		int rem = n % 10;
		rev = rev * 10 + rem;
		n= n / 10;
	  }
	System.out.println("The Number After Reverse is :"+rev);
	if(cpy == rev)
		return true;
	else 
		return false;
	}
}