
public class SoccerTeam {

	private int wins;
	private int losses;
	private int ties;
	private int points;
	private static int gamesPlayed;
	private static int goals;
	
	public SoccerTeam(int wins, int losses, int ties) {
		this.wins = wins;
		this.losses = losses;
		this.ties = ties;
	}
	
	public int getWins() {
		return wins;
	}
	
	public int getLosses() {
		return losses;
	}
	
	public int getTies() {
		return ties;
	}
	
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		if (myScore > opponentScore) {
			this.wins++;
			opponent.losses++;
		} else if (myScore == opponentScore) {
			this.ties++;
			opponent.ties++;
		} else if (myScore < opponentScore) {
			this.losses++;
			opponent.wins++;
		}
		gamesPlayed++;
		goals = goals + myScore + opponentScore;
	}
	
	public int getPoints() {
		points = points + (3 * wins) + ties;
		return points;
	}
	
	public static int getGamesPlayed() {
		return gamesPlayed;
	}
	
	public static int getGoals() {
		return goals;
	}
	
	public void reset() {
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
	}
	
	public static void startTournament() {
		gamesPlayed = 0;
		goals = 0;
	}
}