package footbalTeam;

import java.util.LinkedHashMap;
import java.util.Map;

public class Team {
	
	private String name;
	private Map<String, Player> players;

	Team(String name) {
		this.setName(name);
		players = new LinkedHashMap<String, Player>();
	}
	
	public String getName() {
		return this.name;
	}
	private void setName(String name) {
		if (name.trim().length() <= 0)
			throw new IllegalArgumentException("A name should not be empty.");
		this.name = name;
	}

	public Double getRaiting() {
		return  (this.players.size() == 0 ? 0 
				:this.players.values()
				.stream().mapToDouble(x -> x.getAverage())
				.average()
				.getAsDouble());
	}

	public void addPlayers(Player player) {
		this.players.put(player.getName(), player);
	}

	public void removePlayers(String player) {
		if(!this.players.containsKey(player))
			throw new IllegalArgumentException(String.format("Player %s is not in %s team.", 
					player, this.name));
		players.remove(player);
	}
}
