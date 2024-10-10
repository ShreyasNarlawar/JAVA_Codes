import java.util.Scanner;

class AddNumbers{
   public static void main(String[] args){
      System.out.println("Add numbers");
	  Scanner sc=new Scanner(System.in);
	  int sum=0;
	  for(int i=0;i<10;i++){
	     System.out.println("enter number");
		 int n=sc.nextInt();
		 sum=sum+n;
	 }
	   System.out.println("Addition : " +sum);
	   sc.close();
   }
}