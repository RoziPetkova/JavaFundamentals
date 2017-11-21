package avatar.monuments;

public class FireMonument extends Monuments{
private int fireAffinity;
	
	public FireMonument(String name, int fireAffinity) {
		super(name);
		this.fireAffinity  = fireAffinity;
		super.prop = this.fireAffinity;
	}
	
	@Override
	public String toString() {
		//###Fire Monument: JerseyGrew, Fire Affinity: 1000
		return String.format("###Fire Monument: %s, Fire Affinity: %s\n", this.getName(), this.fireAffinity);
	}
}
