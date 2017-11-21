package avatar.bender;

public class WaterBender extends Bender {
	
	private double waterClarity;
	
	public double getWaterClarity() {
		return waterClarity;
	}

	public WaterBender(String name, int power, double waterClarity) {
		super(name, power);
		this.waterClarity = waterClarity;
		super.propperty = this.waterClarity;
	}

	@Override
	public String toString() {
		//###Air Bender: Yu, Power: 100, Aerial Integrity: 215.68
		return String.format("###Water Bender: %s, Power: %s, Water Clarity: %.2f\n", this.getName(), this.getPower(), this.waterClarity);
	}
}
