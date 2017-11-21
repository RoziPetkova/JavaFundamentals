package footbalTeam;

public class Player {
	
	private String name;
	private int endurance;
	private int sprint;
	private int dribble;
	private int passing;
	private int shooting;
	
	public Player(String name, String endurance, String sprint, String dribble, String passing, String shooting) {
		this.setName(name);
		this.setProperty("Endurance", Integer.parseInt(endurance));
		this.setProperty("Sprint",Integer.parseInt(sprint));
		this.setProperty("Dribble", Integer.parseInt(dribble));
		this.setProperty("Passing", Integer.parseInt(passing));
		this.setProperty("Shooting", Integer.parseInt(shooting));
	}
	
	public String getName() {
		return this.name;
	}
	private void setName(String name) {
		if (name.trim().length() < 0)
			throw new IllegalArgumentException("A name should not be empty.");
		this.name = name;
	}

	private void setProperty(String propetry, int value) {
		if (value < 0 || value > 100)
			throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", propetry));
		else {
			switch (propetry) {
			case "Endurance":
				this.endurance = value; break;
			case "Sprint":
				this.sprint = value; break;
			case "Dribble":
				this.dribble = value; break;
			case "Passing":
				this.passing = value; break;
			case "Shooting":
				this.shooting = value; break;
			}
		}
	}
	
	public Double getAverage() {
		return (this.endurance + this.sprint+ this.dribble + this.passing + this.shooting) / 5.0;
	}
}
