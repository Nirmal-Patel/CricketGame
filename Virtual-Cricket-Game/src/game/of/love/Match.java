package game.of.love;

public class Match {
	
	public int InningDetails(Team team,String format,int inning,int lastInningScore)
	{
		MatchController match = new MatchController();
		
		int over;
		if(format=="T20") over=20;
		else over=50;
		
		InningStatastics stats = new InningStatastics();
		
		stats = match.Inning(team, over, inning, lastInningScore);
		
		Player[] playerList = team.getPlayingTeam();
		
		String a = "Player Name";
		String b = "Score";
		String c = "4's";
		String d = "6's";
		String e = "Out";
		System.out.printf("%-25s%-15s%-7s%-7s%-5s \n \n",a,b,c,d,e);
		
		int[] playerScore = stats.getPlayerScore();
		int[] playerFours = stats.getPlayerFours();
		int[] playerSixes = stats.getPlayerSixes();
		double[] OutAtOver = stats.getOutAtOver();
		int TotalScore = stats.getScore();
		
		String g="-";
		String h="*";
		
		for(int i=0;i<11;i++)
		{
			b = String.valueOf(playerScore[i]);
			c = String.valueOf(playerFours[i]);
			d = String.valueOf(playerSixes[i]);
			e = String.valueOf(OutAtOver[i]);
			if(OutAtOver[i]!=0.0)
			{
				System.out.printf("%-25s%-15s%-7s%-7s%-5s%n",playerList[i].getName(),b,c,d,e);
			}
			else
			{
				String ans = playerList[i].getName() + h;
				System.out.printf("%-25s%-15s%-7s%-7s%-5s%n",ans,b,c,d,g);
			}
		}
		
		System.out.println("\n Total Score : " + TotalScore);
		
		return TotalScore;
	}
	
	
}
