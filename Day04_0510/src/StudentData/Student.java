package StudentData;

public class Student {
	private String studId;
	private String sname;
	private String addr;
	public static String degree;
	private int m1,m2,m3;
	
	public static int min_pas_mark;
	public static int cnt;
	
	static {
		degree = "CDAC";
		min_pas_mark=170;
		cnt = 1;
	}

	public Student() {
		super();
		this.studId= generateCode(null,null);
		this.sname = null;
		this.addr = null;
		this.m1 = 0;
		this.m2 = 0;
		this.m3 = 0;
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String addr, int m1, int m2, int m3) {
		super();
		this.studId = generateCode(sname, addr);
		this.sname = sname;
		this.addr = addr;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	private static String generateCode(String name, String address) {
		// TODO Auto-generated method stub
		if(name != null) {
			return name.substring(0,3)+address.substring(0, 2)+cnt;
		}
		cnt++;
			return "abcd";
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", sname=" + sname + ", addr=" + addr + ", m1=" + m1 + ", m2=" + m2
				+ ", m3=" + m3 + "]";
	}
	

}
