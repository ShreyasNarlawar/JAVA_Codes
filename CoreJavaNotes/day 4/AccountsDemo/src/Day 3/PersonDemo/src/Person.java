import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private int perid;
	private String pname;
	private String mobile;
	private Date bdate;
	//default constructor
	public Person() {
		/*perid=0;
		pname=null;
		mobile=null;
		bdate=null;*/
		//calling parametrized constructor
		this(0,null,null,null);
	}
	//pametrized constructor
	public Person(int perid,String nm,String mob,Date dt) {
		this.perid=perid;
		this.pname=nm;
		mobile=mob;
		bdate=dt;
	}
	public Person(int perid) {
		this.perid=perid;
		this.pname=null;
		mobile=null;
		bdate=null;
	}
	
	//setter methods
	/*public void setPerid(int id) {
		this.perid=id;
	}*/
	public void setPname(String name) {
		this.pname=name;
	}
	
	public void setMobile(String mob) {
		this.mobile=mob;
	}
	
	public void setBdate(Date dt) {
		this.bdate=dt;
	}
	
	//getter methods
	public int getPerid(){
		return perid;
	}
	
	public String getpname() {
		return pname;
	}
	
	public String getMobile() {
		return mobile;
	}
	public Date getBdate() {
		return bdate;
	}
	
	public String toString() {
		//convert date to String
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String dt=sdf.format(bdate);
		return "Id : " +this.perid+"\nName : "+pname+"\nMobile: "+mobile+"\nBDate: "+dt ;
	}
	
	/*public void display() {
		System.out.println("ID : "+perid);
		System.out.println("name: "+pname);
		System.out.println("mobile: "+mobile);
		System.out.println("Bdate: "+bdate);
	}*/

}
