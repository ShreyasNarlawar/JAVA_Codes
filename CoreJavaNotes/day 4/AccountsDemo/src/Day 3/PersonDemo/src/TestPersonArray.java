import java.util.Scanner;

public class TestPersonArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Add new person\n2. delete by ID\n3. search by Id");
		System.out.println("4. Search by name\n5. display all\n6. modify mobile\n7.exit\nChoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			PersonArrayService.addNewPerson();
			break;
		case 2:
			System.out.println("enetr id for delete");
			int id=sc.nextInt();
			boolean status=PersonArrayService.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enetr id for search");
			id=sc.nextInt();
			Person p=PersonArrayService.getById(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("enetr name to search");
			sc.nextLine();
			String nm=sc.nextLine();
			Person[] arr=PersonArrayService.getByName(nm);
			if(arr!=null) {
				for(Person p1:arr) {
					if(p1!=null) {
						System.out.println(p1);
					}else {
						break;
					}
				}
			}
			break;
		case 5:
			arr=PersonArrayService.displayAll();
			for(Person p2:arr) {
				if(p2!=null) {
				   System.out.println(p2);   //toString of Person will be called evry time
				}else {
					break;
				}
			} 
			break;
		case 6:
			System.out.println("enetr id to change mobile");
			id=sc.nextInt();
			System.out.println("enetr new mobile number");
			String mob=sc.next();
			 status=PersonArrayService.modifyMobile(id,mob);
			if(status) {
				System.out.println("updated successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 7:
			System.out.println("Thank you for visiting....");
			sc.close();
			break;
		default:
			break;
			
		}
		}while(choice!=7);
		
	}

}
