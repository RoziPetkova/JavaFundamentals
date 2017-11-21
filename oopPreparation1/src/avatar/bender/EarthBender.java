package avatar.bender;

public class EarthBender extends Bender{
	
	private double groundSaturation;
	
	public double getGroundSaturation() {
		return groundSaturation;
	}

	public EarthBender(String name, int power, double groundSaturation) {
		super(name, power);
		this.groundSaturation = groundSaturation;
		super.propperty = this.groundSaturation;
	}

	@Override
	public String toString() {
		//###Air Bender: Yu, Power: 100, Aerial Integrity: 215.68
		return String.format("###Earth Bender: %s, Power: %s, Ground Saturation: %.2f\n", this.getName(), this.getPower(), this.groundSaturation);
		
	}
}
