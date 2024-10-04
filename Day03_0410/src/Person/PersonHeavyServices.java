package Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonHeavyServices {
	private static PersonBasicMethods[] pdata;
	private static int cnt;
	static Scanner sc = new Scanner (System.in);
	static {
		pdata = new PersonBasicMethods[10];
		pdata[0] = new PersonBasicMethods("Shreyas","7777777",new Date(2002,2,12));
		pdata[1]= new PersonBasicMethods("Shrey","36543477",new Date(2014,1,17));
		pdata[2]= new PersonBasicMethods("Shreya","3654436587",new Date(1124,7,8));
		cnt=3;
	}

	public static void addNewPerson() throws Exception {
		System.out.print("Enter Name :");
		String Name=sc.nextLine();
		System.out.print("Enter Phone Number :");
		String PhoneNum=sc.nextLine();
		System.out.print("Enter Date of Birth(dd/mm/yyyy) :");
		String dob=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");  //Changing the date format into simple date format
		Date dt=null;
		 dt=sdf.parse(dob);
		 pdata[cnt]=new PersonBasicMethods(Name,PhoneNum,dt);
			cnt++;
	}

	public static void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public static PersonBasicMethods[] displayAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void searchById(int search) {
		// TODO Auto-generated method stub
		
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
