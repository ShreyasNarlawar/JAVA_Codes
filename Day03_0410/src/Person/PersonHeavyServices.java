package Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonHeavyServices {
	private static PersonBasicMethods[] pdata;
	private static int cnt;
	static Scanner sc = new Scanner (System.in);
	static {
		pdata = new PersonBasicMethods[10];
		pdata[0] = new PersonBasicMethods("Arnav", "7777987777",LocalDate.of(2002, 2, 12));
		pdata[1]= new  PersonBasicMethods("Akshay","3546543477",LocalDate.of(2000, 4, 11));
		pdata[2]= new  PersonBasicMethods("Yash",  "1244436587",LocalDate.of(2002, 3, 12));
		cnt=3;
	}

	public static void addNewPerson() throws Exception {
		System.out.print("Enter Name :");
		String Name=sc.nextLine();
		System.out.print("Enter Phone Number :");
		String PhoneNum=sc.nextLine();
		System.out.print("Enter Date of Birth(dd/MM/yyyy) :");
		String dob=sc.next();
		    // Parse the date
	       LocalDate ld = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 
	       pdata[cnt]=new PersonBasicMethods(Name,PhoneNum,ld);
			cnt++;
	}

	public static void deletePerson(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++) {
			if(pdata[i].getId()==id) {
				for(int j = i;j<cnt;j++) {
					pdata[j]=pdata[i+j];
				}cnt--;
				System.out.println("Deleted Person Successfully..");
			}
			else
				System.out.println("Not Found in List..!");
		}
	}
	
	public static void displayAll() {
		// TODO Auto-generated method stub
		for (int i=0;i<cnt;i++) {
	        if (pdata != null)
	            System.out.println(pdata[i]);
	        }
	}

	public static void searchById(int search) {
		// TODO Auto-generated method stub
		for(int i =0;i<pdata.length;i++) {
			if(pdata[i]!=null) {
				System.out.println(pdata[i]);
			}else
				System.out.println("Person Not Found.");
		}
		
	}

	public static PersonBasicMethods[] searchByName(String searchName) {
		// TODO Auto-generated method stub
		int count=0;
		PersonBasicMethods[] seaname = new PersonBasicMethods[pdata.length];
		for(PersonBasicMethods pbm : pdata) {
			if(pbm!=null) {
				if(pbm.getName().equals(searchName)) {
					seaname[count]=pbm;
					count++;
				}
			}
		}
		if(count>0)
			return seaname;
		else
			return null;
	}

	public static void updatePhoneNum(int id, String mob) {
		// TODO Auto-generated method stub
		for(PersonBasicMethods pbm : pdata) {
			if(pbm!=null) {
				pbm.setMobileNo(mob);
				System.out.println(" phone Number Successfully Updated.");
			}
			else
				System.out.println("Id Not Found...");
		}
	}
}
