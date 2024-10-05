package Association_Team_Player;

public class Player {
	private int pid;
	private String pname;
	private String speciality;
	
	public Player() {
		super();
	}
	public Player(int pid, String pname, String speciality) {
	    this.pid = pid;
	    this.pname = pname;
	    this.speciality = speciality;
	}

	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid =pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname =pname;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setPid(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", speaciality=" + speciality + "]";
	}
	
	

}
