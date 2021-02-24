package game.of.love;

public class InningStatastics {
	
	private int[] playerScore = new int[11];
	private int[] playerFours = new int[11];
	private int[] playerSixes = new int[11];
	private double[] outAtOver = new double[11];
	private int Score;
	
	public int[] getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int[] playerScore) {
		this.playerScore = playerScore;
	}
	public int[] getPlayerFours() {
		return playerFours;
	}
	public void setPlayerFours(int[] playerFours) {
		this.playerFours = playerFours;
	}
	public int[] getPlayerSixes() {
		return playerSixes;
	}
	public void setPlayerSixes(int[] playerSixes) {
		this.playerSixes = playerSixes;
	}
	public double[] getOutAtOver() {
		return outAtOver;
	}
	public void setOutAtOver(double[] outAtOver) {
		this.outAtOver = outAtOver;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
}
