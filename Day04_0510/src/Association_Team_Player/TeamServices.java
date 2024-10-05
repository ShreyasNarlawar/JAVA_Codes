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
		 tarr[0] = new Team(12, "CSK", "Jadeja", "Shami", plist1);
		 
		Player[] plist2=new Player[15];
		plist2[0]=new Player(11,"Hardik Pandya","Allrounder");
		plist2[1]=new Player(12,"Virat Kohali","Batsman");
        tarr[1] = new Team(11, "MI", "Sachin", "Hardik Pandya", plist2);

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
		}while(ans.equals("y"));
		tarr[cnt]= new Team(Tid,Tname,Coaname,cid,Capname,capSpe,[]plist);
	}

	public static void deleteTeam() {
		// TODO Auto-generated method stub
		
	}

	public static void searchByTeamId() {
		// TODO Auto-generated method stub
		
	}

	public static void searchByPlayerId() {
		// TODO Auto-generated method stub
		
	}

	public static void deletePlayer() {
		// TODO Auto-generated method stub
		
	}

	public static void AddNewPlayer() {
		// TODO Auto-generated method stub
		
	}

	public static void displayAll() {
		// TODO Auto-generated method stub
		
	}

}
