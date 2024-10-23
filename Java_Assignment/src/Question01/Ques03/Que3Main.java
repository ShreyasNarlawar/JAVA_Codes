package Question01.Ques03;

import java.util.Scanner;

public class Que3Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("---Menu for Student Details---");
			System.out.println("1.Add Student \n2.search by id \n3.search by name \n4.calculate GPA \n5.Display Details \n6.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					 Que3Service.addDetails();
					break;
				case 2 :
					System.out.println("Enter id for search :");
					int id = sc.nextInt();
					Que3Service.searchbyid(id);
					break;
				case 3 :
					System.out.println("Enter name to search :");
					String name = sc.next();
					Que3Service.searchByName(name);
					break;
				case 4 :
					System.out.println("Enter id for calculate GPA :");  
					int i = sc.nextInt();
					Que3Service.calculateGpa(i);
					break;
				case 5:
					Que3Service.displayDetails();
					break;
				case 6 :
					sc.close();
					System.out.println("Thanks for Visiting..");
					break;
				default:
					System.out.println("Invalid Choice..");
				}
		}
		while(choice != 6);
	}
}
