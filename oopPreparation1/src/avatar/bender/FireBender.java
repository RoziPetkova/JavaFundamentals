package avatar.bender;

public class FireBender extends Bender {
	
	private double heatAggression;
	
	public double getHeatAggression() {
		return heatAggression;
	}

	public FireBender(String name, int power, double heatAggression) {
		super(name, power);
		this.heatAggression = heatAggression;
		super.propperty = this.heatAggression;
	}

	@Override
	public String toString() {
		//###Air Bender: Yu, Power: 100, Aerial Integrity: 215.68
		return String.format("###Fire Bender: %s, Power: %s, Heat Aggression: %.2f\n", this.getName(), this.getPower(), this.heatAggression);
		
	}
}
