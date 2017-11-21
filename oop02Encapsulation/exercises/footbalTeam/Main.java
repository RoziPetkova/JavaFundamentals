package footbalTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Team> teams = new HashMap<>();
		String[] line = reader.readLine().split(";");

		while (!"END".equals(line[0])) {
			try {
				if (line.length <= 1)
					throw new IllegalArgumentException("A name should not be empty.");

				switch (line[0]) {
				case "Team":
					teams.put(line[1], new Team(line[1])); break;
				case "Add":
					addPlayer(teams, line[1], 
						new Player(line[2], line[3], line[4], line[5], line[6], line[7])); break;
				case "Remove":
					removePlayer(teams, line[1], line[2]); break;
				case "Rating":
					System.out.println(ratingTeam(teams, line[1]));
				default:
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			line = reader.readLine().split(";");
		}
	}
	private static void removePlayer(Map<String, Team> teams, String team, String playerName) {
		if (!teams.keySet().contains(team))
			throw new IllegalArgumentException(String.format("Team %s does not exist.", team));
		teams.get(team).removePlayers(playerName);
	}

	private static String ratingTeam(Map<String, Team> teams, String team) {
		if (!teams.keySet().contains(team))
			throw new IllegalArgumentException(String.format("Team %s does not exist.", team));
		return String.format("%s - %.0f", team, teams.get(team).getRaiting());
	}

	public static void addPlayer(Map<String, Team> teams, String team, Player player) {
		if (!teams.keySet().contains(team))
			throw new IllegalArgumentException(String.format("Team %s does not exist.", team));
		teams.get(team).addPlayers(player);

	}
}
