package Association_Team_Player;

import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.err.println("\tMenu\n\t-----");
			System.out.println("1.Add a new team\n2.Delete the team\n3.Search by Tid\n4.Search by Player Id");
			System.out.println("5.Delete player from the team\n6.Add a new Player in Team\n7.Display all\n8.Exit\n\n\tChoice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				TeamServices.addNewTeam();
				break;
			case 2:
				System.out.println("Enter team id to team delete");
				int tid = sc.nextInt();
				boolean flag = TeamServices.deleteTeam(tid);
				if(flag)
					System.out.println("Team Deleted ");
				else
					System.out.println("Not Found");
				break;
			case 3:
				System.out.println("Enter team id to search team ");
				tid = sc.nextInt();
			     Team t = TeamServices.searchByTeamId(tid);
				if(t != null)
					System.out.println(t);
				else
					System.out.println(tid+"id is Not found");
				break;
			case 4:
				System.out.println("Enter player id to search player");
				int pid = sc.nextInt();
				t = TeamServices.searchByPlayerId(pid);
				if(t != null)
					System.out.println(t);
				else
					System.out.println(pid+"id is not found");
				break;
//			case 5:
//				System.out.println("Enter player id to delete player");
//				pid = sc.nextInt();
////				boolean delp = TeamServices.deletePlayer(pid);
//				if(delp)
//					System.out.println("Player deleted");
//				else
//					System.out.println("Not Found");
//				break;
			case 6:
				System.out.println("Enter team id to app new player ");
				tid = sc.nextInt();
				boolean status = TeamServices.AddNewPlayer(tid);
				if(status)
					System.out.println("Player added successfully");
				else
					System.out.println("Not founr");
				break;
			case 7:
				Team[] tarr = TeamServices.displayAll();
				
				for(Team t1 : tarr) {
					if(t1 != null)
					System.out.println(t1);
					else
						break;
				}
				break;
			case 8:
				System.out.println("Thanks for Visiting Our Sports Club...!!");
				sc.close();
				break;
			default:
				System.err.println("!!!!!!!!!!!!Inappropriate Choice..!!!!!!!!!!!!\n\nTry again....!\n\n\n");
				break;
			}
		}while(ch!=8);
	}

}
