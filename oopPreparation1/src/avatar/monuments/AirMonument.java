package avatar.monuments;

public class AirMonument extends Monuments {

	private int airAffinity ;
	
	public AirMonument(String name, int airAff) {
		super(name);
		this.airAffinity = airAff;
		super.prop = this.airAffinity;
	}
	
	@Override
	public String toString() {
		//###Fire Monument: JerseyGrew, Fire Affinity: 1000
		return String.format("###Air Monument: %s, Air affinity: %s\n", this.getName(), this.airAffinity);
	}
}
