package avatar.monuments;

public class WaterMonument extends Monuments {
	private int waterAffinity;

	public WaterMonument(String name, int waterAffinity) {
		super(name);
		this.waterAffinity = waterAffinity;
		super.prop = this.waterAffinity;
	}
	
	@Override
	public String toString() {
		//###Fire Monument: JerseyGrew, Fire Affinity: 1000
		return String.format("###Water Monument: %s, Water affinity: %s\n", this.getName(), this.waterAffinity);
	}

}
