import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("The Student Name is :"+name+"\n and His College is :"+(args[0])+(args[1]));
		
	}

}
