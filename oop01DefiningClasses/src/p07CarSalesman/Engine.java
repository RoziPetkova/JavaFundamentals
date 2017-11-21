package p07CarSalesman;
//An Engine has model, power, 
//displacement and efficiency. 
public class Engine {
	
	protected String model;
	protected Integer power;
	protected Integer displacement;
	protected String efficiensy;
	
	Engine(String model, Integer power) {	
		this(model, power, null, null);
	}
	Engine(String model, Integer power, Integer displacement, String efficiensy) {
		this.model = model;
		this.power = power;
		this.displacement = displacement ;
		this.efficiensy = efficiensy;
	}
	Engine(String model, Integer power, String unknowk) {
		this.model = model;
		this.power = power;
		try {
			this.displacement = Integer.valueOf(unknowk);
			this.efficiensy = null;
		} catch (NumberFormatException e) {
			this.displacement = null;
			this.efficiensy = unknowk;
		}
		
	}
}
