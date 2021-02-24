package game.of.love;

import java.util.Scanner;

public class CricketGame {
	
	public static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to World of Cricket \n \n");
		
		String format;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select one format from T20 or Oneday. \n\n");
		
		
		while(true)
		{
			System.out.print("Format : ");
			format = sc.nextLine();
			if(!format.equals("T20") && !format.equals("Oneday"))
			{
				System.out.println("Please select correct format name. \n \n");
				continue;
			}
			else
			{
				System.out.println("\n");
				break;
			}
		}
		
		System.out.println("Please Select two teams from India,Australia and England \n\n");
		String team1,team2;
		while(true)
		{
			System.out.print("Team1 : ");
			team1 = sc.next();
			
			if(!team1.equals("India") && !team1.equals("Australia") && !team1.equals("England"))
			{
				System.out.println("Please Choose correct team name...\n");
				continue;
			}
			
			System.out.print("Team2 : ");
			team2 = sc.next();
			
			if(!team2.equals("India") && !team2.equals("Australia") && !team2.equals("England"))
			{
				System.out.println("Please Choose correct team name...\n");
				continue;
			}
			
			if(team1.equals(team2))
			{
				System.out.println("Please Choose different Teams to play. \n");
				continue;
			}
			else 
			{
				break;
			}
		}
		
		BuildTeam builder = new BuildTeam();
		Team team_1 = new Team();
		
		if(team1.equals("India"))
		{
			team_1 = builder.CreateTeamIndia();
		}
		else if(team1.equals("Australia"))
		{
			team_1 = builder.CreateTeamAus();
		}
		else if(team1.equals("England"))
		{
			team_1 = builder.CreateTeamEngland();
		}
		
		Team team_2 = new Team();
		
		if(team2.equals("India"))
		{
			team_2 = builder.CreateTeamIndia();
		}
		else if(team2.equals("Australia"))
		{
			team_2 = builder.CreateTeamAus();
		}
		else if(team2.equals("England"))
		{
			team_2 = builder.CreateTeamEngland();
		}
		
		sc.close();
		
		System.out.println("\n Great you are ready to play!! \n");
		
		System.out.println("Time for Toss... \n");
		
		int x =(int)(0.5 + Math.random());
		
		if(x==0) System.out.println(team1 + " choose Head \n");
		else System.out.println(team1 + " choose Tail \n");
		
		System.out.println("And the Coin is in the Air...........\n");
		
		wait(3000);
		
		int y = (int)(0.5 + Math.random());
		
		int t=0;
		
		if(y==x)
		{
			if(x==0)
			{
				System.out.println("It's Head...Congratulations "+ team1 + "\n");
				wait(3000);
				System.out.println("Hureee!! " + team1 + " choose to bat. \n");
			}
			else
			{
				System.out.println("It's Tail...Congratulations "+ team1 + "\n");
				wait(3000);
				System.out.println("Hureee!! " + team1 + " choose to bat. \n");
			}
		}
		else
		{
			if(x==0)
			{
				System.out.println("It's Tail...Congratulations "+ team2 + "\n");
				wait(3000);
				System.out.println("Hureee!! " + team2 + " choose to bat. \n");
			}
			else
			{
				System.out.println("It's Head...Congratulations "+ team2 + "\n");
				wait(3000);
				System.out.println("Hureee!! " + team2 + " choose to bat. \n");
			}
			t=1;
		}
		
		wait(2000);
		System.out.println("1st inning of Match... Enjoy... \n");
		Match match = new Match();
		int chaseScore,chasedScore;
		if(t==0)
		{
			System.out.println(team1+"'s Batting..... \n");
			chaseScore = match.InningDetails(team_1,format,1,0);
			wait(5000);
			
			System.out.println("\n So,"+team2+" need "+(chaseScore+1)+" to win!! \n");
			
			System.out.println(team2+"'s Batting..... \n");
			chasedScore = match.InningDetails(team_2,format,2,chaseScore+1);
			wait(5000);
			
			if(chasedScore > chaseScore)
			{
				System.out.println("\n \n Hurreee!!! " + team2 + " won the match.");
			}
			else if(chasedScore < chaseScore)
			{
				System.out.println("\n \n Hurreee!!! " + team1 + " won the match.");
			}
			else
			{
				System.out.println("\n \n Match is tied.");
			}
		}
		else
		{
			System.out.println(team2+"'s Batting..... \n");
			chaseScore = match.InningDetails(team_2,format,1,0);
			wait(5000);
			
			System.out.println("\n So,"+team1+" need "+(chaseScore+1)+" to win!! \n");
			
			System.out.println(team1+"'s Batting..... \n");
			chasedScore = match.InningDetails(team_1,format,2,chaseScore+1);
			wait(5000);
			
			if(chasedScore > chaseScore)
			{
				System.out.println("\n \n Hurreee!!! " + team1 + " won the match.E");
			}
			else if(chasedScore < chaseScore)
			{
				System.out.println("\n \n Hurreee!!! " + team2 + " won the match.");
			}
			else
			{
				System.out.println("\n \n Match is tied.");
			}
		}
	}

}
