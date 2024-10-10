import java.util.Scanner;

class AcceptNames{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 for(int i=0;i<5;i++){
		 System.out.println("enetr name:");
	    String nm=sc.nextString();
		System.out.println("Name : "+nm);
	 }
  }
}

