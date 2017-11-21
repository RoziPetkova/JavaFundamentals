package avatar.monuments;

public class EarthMonument extends Monuments {
	
	private int earthAffinity;

	public EarthMonument(String name, int earthAffinity) {
		super(name);
		this.earthAffinity = earthAffinity;
		super.prop = this.earthAffinity;
	}
	
	@Override
	public String toString() {
		//###Fire Monument: JerseyGrew, Fire Affinity: 1000
		return String.format("###Earth Monument: %s, Earth affinity: %s\n", this.getName(), this.earthAffinity);
	}
}
