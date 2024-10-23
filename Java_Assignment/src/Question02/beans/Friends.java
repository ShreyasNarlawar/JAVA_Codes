package Question02.beans;

import java.time.LocalDate;

public class Friends {
	
	private int id;
	private String name;
	private String lastname;
	private String hobbies;
	private long num;
	private String email;
	private LocalDate date;
	private String addr;
	
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friends(int id, String name, String lastname, String hobbies, long num, String email, LocalDate date,
			String addr) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.num = num;
		this.email = email;
		this.date = date;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", lastname=" + lastname + ", hobbies=" + hobbies + ", num="
				+ num + ", email=" + email + ", date=" + date + ", addr=" + addr + "]";
	}
	
	

}
