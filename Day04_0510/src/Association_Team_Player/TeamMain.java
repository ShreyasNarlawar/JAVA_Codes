package Association_Team_Player;

import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.err.println("\tMenu\n\t-----");
			System.out.println("1.Add a new team\n2.Delete the team\3.Search by Tid\n4.Search by Player Id");
			System.out.println("5.Delete player from the team\n6.Add a new Player in Team\n7.Display all\n8.Exit\n\n\tChoice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				TeamServices.addNewTeam();
				break;
			case 2:
				TeamServices.deleteTeam();
				break;
			case 3:
				TeamServices.searchByTeamId();
				break;
			case 4:
				TeamServices.searchByPlayerId();
				break;
			case 5:
				TeamServices.deletePlayer();
				break;
			case 6:
				TeamServices.AddNewPlayer();
				break;
			case 7:
				TeamServices.displayAll();
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
