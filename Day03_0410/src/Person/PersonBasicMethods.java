package Person;

import java.time.LocalDate;

public class PersonBasicMethods {

	static private int Id=0;
	private String Name;
	private String MobileNo;
	private LocalDate dob;
	public PersonBasicMethods() {
		this(null,null,null);
	}
	public PersonBasicMethods( String name, String mobileNo, LocalDate dob) {
		Name = name;
		MobileNo = mobileNo;
		this.dob = dob;
	}
	public int getId() {
		return Id;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String toString() {
		 
				return "Person Details:\n------ ---------\n"
				+ " [Id=" + (++Id) + ", Name=" + Name + ","
				+ " MobileNo=" + MobileNo + ", dob=" + dob + "]";
	}
	public void display() {
		 
		System.out.println("Name :"+Name);
		System.out.println("Id :"+Id);
		System.out.println("Mobile Number :"+MobileNo);
		System.out.println("Date of Birth :"+dob);
	}
}
