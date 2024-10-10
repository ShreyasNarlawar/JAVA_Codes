
public class Student {
	private int sid;
	private String sname;
	private float m1,m2,m3;
	
	public Student() {
		sid=0;
		sname=null;
		m1=0.0f;
		m2=0.0f;
		m3=0.0f;
	}
	
	public Student(int sid,String name,float m1,float m2,float m3) {
		this.sid=sid;
		sname=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	
	//setter methods
	public void setSname(String nm) {
		sname=nm;
	}
	public void setM1(float m1) {
		this.m1=m1;
	}
	public void setM2(float m2) {
		this.m2=m2;
	}
	public void setM3(float m3) {
		this.m3=m3;
	}
	
	public int getSid() {
		return this.sid;
	}
	public String getSname() {
		return this.sname;
	}
	public float getM1() {
		return this.m1;
	}
	public float getM2() {
		return this.m2;
	}
	public float getM3() {
		return this.m3;
	}
	public String toString() {
		return "Id : "+sid+"\nName: "+sname+"\nM1: "+m1+"\nM2: "+m2+"\nM3: "+m3;
	}

}
