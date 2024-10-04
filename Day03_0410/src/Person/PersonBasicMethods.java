package Person;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonBasicMethods {

	static private int Id=0;
	private String Name;
	private String MobileNo;
	private Date dob;
	public PersonBasicMethods() {
		this(null,null,null);
	}
	public PersonBasicMethods( String name, String mobileNo, Date dob) {
		Name = name;
		MobileNo = mobileNo;
		this.dob = dob;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String dt=sdf.format(dob);
		return "Person Details:\n------ ---------\n"
				+ " [Id=" + (++Id) + ", Name=" + Name + ","
				+ " MobileNo=" + MobileNo + ", dob=" + dt + "]";
	}
	public void display() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String dt=sdf.format(dob);
		System.out.println("Name :"+Name);
		System.out.println("Id :"+Id);
		System.out.println("Mobile Number :"+MobileNo);
		System.out.println("Date of Birth :"+dt);
	}
}
