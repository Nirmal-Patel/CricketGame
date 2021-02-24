package game.of.love;

public class Team {
	
	private String name;
	private Player[] playingTeam = new Player[11];
	private Player[] supportingTeam = new Player[4];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Player[] getPlayingTeam() {
		return playingTeam;
	}
	public void setPlayingTeam(Player[] playingTeam) {
		this.playingTeam = playingTeam;
	}
	
	public Player[] getSupportingTeam() {
		return supportingTeam;
	}
	
	public void setSupportingTeam(Player[] supportingTeam) {
		this.supportingTeam = supportingTeam;
	}
}
