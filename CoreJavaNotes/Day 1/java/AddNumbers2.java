//Write a program to accept 10 numbers from user and find sum of all numbers which are eith divisible 
//by 5 or 3 or 11
import java.util.Scanner;
class AddNumbers2{
   public static void main(String[] args){
     int sum=0;
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<10;i++){
	   System.out.println("Enetr number");

	   int n=sc.nextInt();
	   if((n%5==0) || (n%3==0) || (n%11==0)){
	      sum=sum+n;
	   }
	 }	
	 System.out.println("Sum : "+sum);
	 sc.close();
   }
}