package Person;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("\tMenu\n\t-----");
			System.out.println("1.Add New Person\n2.Delete Person\n3.Display Persons\n4.Search by Id\n5.Search by Name ");
			System.out.println("6.Update Phone Number\n7.Exit\n\n");
			System.out.println("\tEnter Choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				PersonHeavyServices.addNewPerson();
				break;
			case 2:
				System.out.print("Enter Person Id for Deletion :");
				int id = sc.nextInt();
				PersonHeavyServices.deletePerson(id);
				break;
			case 3:
			    PersonBasicMethods[] arr = PersonHeavyServices.displayAll();
			    for (PersonBasicMethods pm : arr) {
			        if (pm != null)
			            System.out.println(pm); 
			        else
			            break; 
			        }
			    break;
			case 4:
				System.out.println("Enter Id for Search : ");
				int search = sc.nextInt();
				PersonHeavyServices.searchById(search);
				break;
			case 5:
				System.out.println("Enter name for Search : ");
				String searchName = sc.nextLine();
				PersonHeavyServices.searchByName(searchName);
				if(arr!=null) {
					for(PersonBasicMethods pm:arr) {
						if(pm!=null) {
							System.out.println(pm);
						}else {
							break;
						}
					}
				}
				break;
			case 6:
				System.out.print("Enter Person Id to Change the Phone Number: ");
				id=sc.nextInt();
				System.out.print("Enter Number to Update: ");
				String mob=sc.nextLine();
				PersonHeavyServices.updatePhoneNum(id,mob);
				
			}
		}while(ch!=7);
	}
}
