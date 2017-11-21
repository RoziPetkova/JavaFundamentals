package avatar.bender;

public class AirBender extends Bender {


	private double aerialIntegirty;
	
	public double getAerialIntegirty() {
		return aerialIntegirty;
	}

	public AirBender(String name, int power, double aerialIntegirty) {
		super(name, power);
		this.aerialIntegirty = aerialIntegirty;
		super.propperty = this.aerialIntegirty;
	}
	
	@Override
	public String toString() {
		//###Air Bender: Yu, Power: 100, Aerial Integrity: 215.68
		return String.format("###Air Bender: %s, Power: %s, Aerial Integrity: %.2f\n", this.getName(), this.getPower(), this.aerialIntegirty);
		
	}
}
