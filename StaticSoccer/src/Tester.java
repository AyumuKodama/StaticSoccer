
public class Tester {

	public static void main(String[] args) {
		
		System.out.println("Tournament #1");
		
		SoccerTeam team1 = new SoccerTeam(3, 2, 5);
		SoccerTeam team2 = new SoccerTeam(4, 1, 2);
		SoccerTeam team3 = new SoccerTeam(3, 3, 1);
		SoccerTeam team4 = new SoccerTeam(5, 0, 0);
		
		team1.played(team2, 2, 4);
		team2.played(team3, 5, 3);
		team3.played(team4, 2, 2);
		team4.played(team1, 0, 1);
		
		System.out.println("Team 1: " + team1.getPoints() + " points");
		System.out.println("Team 2: " + team2.getPoints() + " points");
		System.out.println("Team 3: " + team3.getPoints() + " points");
		System.out.println("Team 4: " + team4.getPoints() + " points");
		System.out.println("Goals scored: " + SoccerTeam.getGoals());
		System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
		
		SoccerTeam.startTournament();
		team1.reset();
		team2.reset();
		team3.reset();
		team4.reset();
		System.out.println();
		System.out.println("Tournament #2");
		
		team1.played(team3, 3, 3);
		team2.played(team4, 2, 1);
		team3.played(team1, 4, 2);
		team4.played(team2, 1, 0);
		
		System.out.println("Team 1: " + team1.getPoints() + " points");
		System.out.println("Team 2: " + team2.getPoints() + " points");
		System.out.println("Team 3: " + team3.getPoints() + " points");
		System.out.println("Team 4: " + team4.getPoints() + " points");
		System.out.println("Goals scored: " + SoccerTeam.getGoals());
		System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
	}
}