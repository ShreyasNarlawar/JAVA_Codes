import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.text.ParseException;

public class StudentArrayService {
	private static Person[] perarr;
	private static int cnt;
	static {
		perarr=new Student[10];
		perarr[0]=new Person(12,"Rajan","2222",new Date(2000/04/27));
		perarr[1]=new Person(13,"Atharva","33333",new Date(1997/04/27));
		perarr[2]=new Person(14,"Revati","2222",new Date(1997/02/05));
		cnt=3;
	}
	

	public static void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int perid=sc.nextInt();
		sc.nextLine(); // to remove \n from scanner buffer
		System.out.println("enetr name");
		String nm=sc.nextLine();
		System.out.println("enetr mobile");
		String mob=sc.next();
		System.out.println("Enetr birthdate(dd/MM/yyyy)");
		String bdate=sc.next();
		
		//to convert String to Date
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dt=null;
		try {
			 dt=sdf.parse(bdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		perarr[cnt]=new Person(perid,nm,mob,dt);
		cnt++;
	}


	public static Person[] displayAll() {
		return perarr;
	}


	public static Person getById(int id) {
		for(Person p:perarr) {
			if(p!=null) {
				if(p.getPerid()==id) {
				    return p;
			    }
		    }else {
		    	return null;
		    }
		}
		return null;
		
	}


	public static Person[] getByName(String nm) {
		Person[] arr=new Person[perarr.length];
		int count=0;
		for(Person p:perarr) {
			if(p!=null) {
				if(p.getpname().equals(nm)) {
					arr[count]=p;
					count++;
				}
			}else {
				break;
			}
		}
		if(count>0) {
			return arr;
		}else {
			return null;
		}
	}


	public static boolean modifyMobile(int id, String mob) {
		Person p=getById(id);
		if(p!=null) {
			p.setMobile(mob);
			return true;
		}
		 return false;
	}


	public static boolean deleteById(int id) {
		for(int i=0;i<cnt;i++) {
			if(perarr[i].getPerid()==id) {
				
				for(int j=i;j<cnt;j++) {
					perarr[j]=perarr[j+1];   
				}
				cnt--;
				return true;
			}
			
		}
		return false;
	}

}
