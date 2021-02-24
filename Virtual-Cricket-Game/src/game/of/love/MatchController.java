package game.of.love;

public class MatchController 
{
	public InningStatastics Inning(Team team,int totalOver,int inning,int totalScore)
	{
		InningStatastics stat = new InningStatastics();
		
		int[] playerScore = {0,0,0,0,0,0,0,0,0,0,0};
		int[] playerFours = {0,0,0,0,0,0,0,0,0,0,0};
		int[] playerSixes = {0,0,0,0,0,0,0,0,0,0,0};
		double[] outAtOver = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		
		int Score=0;
		
		int onStrikePlayerId=0;
		int offStrikePlayerId=1;
		int nextPlayerId=2;
		boolean allOut = false;
		boolean Win = false;
		
		for(int over=1;over<=totalOver;over++)
		{
			for(int ball=1;ball<=6;ball++)
			{
				int run = (int)(Math.random()*(6.9));
				
				if(run==1 || run==3)
				{
					playerScore[onStrikePlayerId]+=run;
					int temp = onStrikePlayerId;
					onStrikePlayerId = offStrikePlayerId;
					offStrikePlayerId = temp;
					Score = Score + run;
				}
				else if(run==6)
				{
					double x = (over-1) + ((double)ball/10);
					outAtOver[onStrikePlayerId]=x;
					if(nextPlayerId==11)
					{
						allOut = true;
						break;
					}
					onStrikePlayerId = nextPlayerId;
					nextPlayerId++;
				}
				else if(run==4)
				{
					playerFours[onStrikePlayerId]++;
					playerScore[onStrikePlayerId]+=run;
					Score = Score + run;
				}
				else if(run==5)
				{
					playerSixes[onStrikePlayerId]++;
					playerScore[onStrikePlayerId]+=6;
					Score = Score + 6;
				}
				else
				{
					Score = Score + run;
					playerScore[onStrikePlayerId]+=run;
				}
				if(inning==2 && Score>totalScore)
				{
					Win = true;
					break;
				}
			}
			if(allOut==true || Win==true)
			{
				break;
			}
			int temp = onStrikePlayerId;
			onStrikePlayerId = offStrikePlayerId;
			offStrikePlayerId = temp;
		}
		
		stat.setPlayerScore(playerScore);
		stat.setPlayerFours(playerFours);
		stat.setPlayerSixes(playerSixes);
		stat.setOutAtOver(outAtOver);
		stat.setScore(Score);
		
		return stat;
	}

}
