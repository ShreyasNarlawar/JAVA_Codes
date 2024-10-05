package Association_Team_Player;

import java.util.Arrays;

public class Team {
	private int tid;
	private String tname;
	private String coach;
	private String captain;
	private Player[] plist;
	
	public Team(){
		super();
	}
	public Team(int tid, String tname, String coach, String captain, Player[] plist) {
	    super();
	    this.tid = tid;
	    this.tname = tname;
	    this.coach = coach;
	    this.captain = captain;
	    this.plist = plist;
	}

	public int getid() {
		return tid;
	}
	public void settid(int tid) {
		this.tid = tid;
	}
	public String gettname() {
		return tname;
	}
	public void settname(String tname) {
		this.tname = tname;
	}
	public String coach() {
		return coach;
	}
	public void setcoach(String coach) {
		this.coach = coach;
	}
	public String captain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain =captain;
	}
	public Player[] plist() {
		return plist;
	}
	public void setCaptain(Player[] plist) {
		this.plist =plist;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", coach=" + coach + ", captain=" + captain + ", plist="
				+ Arrays.toString(plist) + "]";
	}
}
