package avatar.bender;

 public abstract class Bender {
	
	private String name;
	private int power;
	 double propperty;
	
	String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}
	public double getProp() {
		return this.propperty;
	}

	Bender(String name, int power) {
		this.name = name;
		this.power = power;
	}
}
