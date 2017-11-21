package mordorsCruelPlan;

public class Gandalf {
	private int pointsOfHappyness = 0;
	
	public int getPoints() {
		return this.pointsOfHappyness;
	}
	public void controlPoints(String food) {
		food = food.toLowerCase();
		this.pointsOfHappyness = this.pointsOfHappyness +(food.equals("cram") ? 2 
				: food.equals("lembas") ? 3 
				: food.equals("apple") ? 1
				: food.equals("melon") ? 1 
				: food.equals("honeycake") ? 5 
				: food.equals("mushrooms") ? -10 : -1);
	}
	
	public String getMood() {
		return this.pointsOfHappyness < -5 ? "Angry" 
				: this.pointsOfHappyness >= -5 && this.pointsOfHappyness < 0 ? "Sad"
				: this.pointsOfHappyness >= 0 && this.pointsOfHappyness < 15 ? "Happy"
				: this.pointsOfHappyness >= 15 ? "JavaScript" 
						: null;
	}
}
