package avatar.monuments;

public abstract class Monuments {
	private String name;
	protected double prop;

	String getName() {
		return name;
	}

	public double getProp(){
		return this.prop;
	}
	Monuments(String name) {
		this.name = name;
	}
}
