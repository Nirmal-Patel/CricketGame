package game.of.love;

public class BuildTeam {
	
	Team india = new Team();
	
	Team aus = new Team();
	
	Team england = new Team();
	
	public Team CreateTeamIndia()
	{
		india.setName("India");
		
		Player[] playing = new Player[11];
		Player[] extra = new Player[5];
		
		playing[0] = new Player();
		playing[1] = new Player();
		playing[2] = new Player();
		playing[3] = new Player();
		playing[4] = new Player();
		playing[5] = new Player();
		playing[6] = new Player();
		playing[7] = new Player();
		playing[8] = new Player();
		playing[9] = new Player();
		playing[10] = new Player();
		
		extra[0] = new Player();
		extra[1] = new Player();
		extra[2] = new Player();
		extra[3] = new Player();
		
		playing[0].setName("Rohit Sharma");
		playing[0].setType("Batsman");
		
		playing[1].setName("Shubman Gill");
		playing[1].setType("Batsman");
		
		playing[2].setName("Cheteshwar Pujara");
		playing[2].setType("Batsman");
		
		playing[3].setName("Virat Kohli");
		playing[3].setType("Batsman");
		
		playing[4].setName("Ajinkya Rahane");
		playing[4].setType("Batsman");
		
		playing[5].setName("Rishabh Pant");
		playing[5].setType("Batsman");
		
		playing[6].setName("Axar Patel");
		playing[6].setType("Allrounder");
		
		playing[7].setName("Ravichandran Ashwin");
		playing[7].setType("Allrounder");
		
		playing[8].setName("Ishant Sharma");
		playing[8].setType("Bowler");
		
		playing[9].setName("Kuldeep Yadav");
		playing[9].setType("Bowler");
		
		playing[10].setName("Mohammed Siraj");
		playing[10].setType("Bowler");
		
		extra[0].setName("Mayank Agarwal");
		extra[0].setType("Batsman");
		
		extra[1].setName("Washington Sundar");
		extra[1].setType("Allrounder");
		
		extra[2].setName("Hardik Pandya");
		extra[2].setType("Allrounder");
		
		extra[3].setName("Jasprit Bumrah");
		extra[3].setType("Bowler");
		
		india.setPlayingTeam(playing);
		india.setSupportingTeam(extra);
		
		return india;
	}
	
	public Team CreateTeamAus()
	{
		aus.setName("Australia");
		Player[] playing = new Player[11];
		Player[] extra = new Player[5];
		
		playing[0] = new Player();
		playing[1] = new Player();
		playing[2] = new Player();
		playing[3] = new Player();
		playing[4] = new Player();
		playing[5] = new Player();
		playing[6] = new Player();
		playing[7] = new Player();
		playing[8] = new Player();
		playing[9] = new Player();
		playing[10] = new Player();
		
		extra[0] = new Player();
		extra[1] = new Player();
		extra[2] = new Player();
		extra[3] = new Player();
		
		playing[0].setName("David Warner");
		playing[0].setType("Batsman");
		
		playing[1].setName("Aaron Finch");
		playing[1].setType("Batsman");
		
		playing[2].setName("Marcus Stoinis");
		playing[2].setType("Allrounder");
		
		playing[3].setName("Marnus Labuschangne");
		playing[3].setType("Allrounder");
		
		playing[4].setName("Mitchell Marsh");
		playing[4].setType("Batsman");
		
		playing[5].setName("Alex Carey");
		playing[5].setType("Batsman");
		
		playing[6].setName("Glenn Maxwell");
		playing[6].setType("Allrounder");
		
		playing[7].setName("Pat Cummins");
		playing[7].setType("Bowler");
		
		playing[8].setName("Mitchell Starc");
		playing[8].setType("Bowler");
		
		playing[9].setName("Adam Zampa");
		playing[9].setType("Bowler");
		
		playing[10].setName("Josh Hazlewood");
		playing[10].setType("Bowler");
		
		extra[0].setName("Steve Smith");
		extra[0].setType("Batsman");
		
		extra[1].setName("Andrew Tye");
		extra[1].setType("Bowler");
		
		extra[2].setName("Tim Paine");
		extra[2].setType("Batsman");
		
		extra[3].setName("Travis Head");
		extra[3].setType("Allrounder");
		
		aus.setPlayingTeam(playing);
		aus.setSupportingTeam(extra);
		
		return aus;
	}
	
	public Team CreateTeamEngland()
	{
		england.setName("England");
		Player[] playing = new Player[11];
		Player[] extra = new Player[5];
		
		playing[0] = new Player();
		playing[1] = new Player();
		playing[2] = new Player();
		playing[3] = new Player();
		playing[4] = new Player();
		playing[5] = new Player();
		playing[6] = new Player();
		playing[7] = new Player();
		playing[8] = new Player();
		playing[9] = new Player();
		playing[10] = new Player();
		
		extra[0] = new Player();
		extra[1] = new Player();
		extra[2] = new Player();
		extra[3] = new Player();
		
		playing[0].setName("Rory Burns");
		playing[0].setType("Batsman");
	
		playing[1].setName("Dominic Sibley");
		playing[1].setType("Batsman");
		
		playing[2].setName("Daniel Lawrence");
		playing[2].setType("Batsman");
		
		playing[3].setName("Joe Root");
		playing[3].setType("Batsman");
		
		playing[4].setName("Ben Stokes");
		playing[4].setType("Allrounder");
		
		playing[5].setName("Ollie Pope");
		playing[5].setType("Allrounder");
		
		playing[6].setName("Ben Foakes");
		playing[6].setType("Batsman");
		
		playing[7].setName("Moeen Ali");
		playing[7].setType("Bowler");
		
		playing[8].setName("Stuart Broad");
		playing[8].setType("Bowler");
		
		playing[9].setName("Jack Leach");
		playing[9].setType("Bowler");
		
		playing[10].setName("Jofra Archer");
		playing[10].setType("Bowler");
		
		extra[0].setName("Chris Woakes");
		extra[0].setType("Allrounder");
		
		extra[1].setName("Eoin Morgan");
		extra[1].setType("Batsman");
		
		extra[2].setName("Joss Buttler");
		extra[2].setType("Batsman");
		
		extra[3].setName("Sam Curren");
		extra[3].setType("Batsman");
		
		england.setPlayingTeam(playing);
		england.setSupportingTeam(extra);
		
		return england;
	}

}
