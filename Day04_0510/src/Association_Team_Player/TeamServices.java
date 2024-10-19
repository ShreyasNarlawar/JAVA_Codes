package Association_Team_Player;

import java.util.Scanner;

public class TeamServices {
	
	static Team[] tarr;
	static int cnt;
	
	static {
		tarr = new Team[15];
		
		Player plist1[] = new Player[13];
		plist1[0] = new Player(1,"Rohit","Batsman");
		plist1[1] = new Player(2,"Virat","Batsman");
		 tarr[0] = new Team(34, "CSK", "Jadeja", new Player(7,"Shami","bowler"),plist1);
		 
		Player[] plist2=new Player[15];
		plist2[0]=new Player(11,"Hardik Pandya","Allrounder");
		plist2[1]=new Player(12,"Virat Kohali","Batsman");
        tarr[1] = new Team(54, "MI", "Sachin",new Player(5,"gambhir","batsman"), plist2);

		cnt=2;
		
		
	}

	public static void addNewTeam() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team Id:");
		int Tid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Team Name:");
		String Tname = sc.nextLine();
		System.out.println("Enter Coach Name:");
		String Coaname=sc.nextLine();
		System.out.println("Enter Captain Id:");
		int cid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Captain Name:");
		String Capname = sc.nextLine();
		System.out.println("Enter Captain Spaciality:");
		String capSpe=sc.nextLine();
		Player p = new Player(cid,Capname,capSpe);
		Player []plist = new Player[13];
		int cnt =0;
		String ans ="y";
		do {
			System.out.println("Enter Player Id :");
			int Pid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Player Name :");
			String Pname = sc.nextLine();
			System.out.println("Enter Speciality :");
			String Pspe=sc.nextLine();
			plist[cnt] = new Player(Pid,Pname,Pspe);
			cnt++;
			System.out.println("Do You Wannaa to continueee..????(y/n)");
			ans = sc.next();
		}while(ans.equals("y"));
		tarr[cnt]= new Team(Tid,Tname,Coaname,p,plist);
		cnt++;
	}

	public static boolean deleteTeam(int id) {
		
		for(int i =0; i< cnt; i++) {
			
			if(tarr[i].getid()== id) {
				
				for(int j =i; j < cnt; j++) {
					
					tarr[j] = tarr[j+1];
				}
				cnt --;
				return true;
			}
		}
		return false;
		
	}

	public static Team searchByTeamId(int num) {
		for(Team t : tarr) {
			if( t!= null) {
				if(t.getid() == num) {
					return t;
				}
			}else 
				break;
		}
		return null;
		
	}

	public static Team searchByPlayerId(int pid) {
		for(Team t : tarr) {
			if( t != null) {
				
				Player[]plist = t.plist();
				for(Player p :plist) {
					if(p != null) {
						if(p.getPid() == pid) {
							return t;
						}
					}else 
						break;
				}
			}else
				break;
		}
		return null;
	}

//	public static boolean deletePlayer(int pid) {
//		
//		Player[] plist = new Player();
//         for(int i =0; i< cnt; i++) {
//			
//			if(plist[i].getPid()== pid) {
//				
//				for(int j =i; j < cnt; j++) {
//					
//					plist[j] = plist[j+1];
//				}
//				cnt --;
//				return true;
//			}
//		}
//		return false;
//		
//	}

	public static boolean AddNewPlayer(int tid) {
		
		Team t = searchByTeamId(tid);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Player Id :");
		int Pid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Player Name :");
		String Pname = sc.nextLine();
		
		System.out.println("Enter Speciality :");
		String Pspe=sc.nextLine();
		
		Player p = new Player(Pid, Pname, Pspe);
		Player[] plist = t.plist();
		
		for(int i = 0; i < plist.length; i++) {
			if(plist[i] == null) {
				plist[i] = p;
		      return true;
			}else {
				return false;
			}
		}
		return false;
	}

	public static Team[] displayAll() {
		return tarr;
		
	}
	
	

}
