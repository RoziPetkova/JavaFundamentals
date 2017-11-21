package p07CarSalesman;

public class Car {
	protected String model;
	protected String engineName;
	protected Integer weight;
	protected String color;
	protected Engine engine;

	Car(String model, Engine engine) {	
		this(model, engine, null, null);
	}
	Car(String model, Engine engine, Integer weight, String color) {
		this.model = model;
		this.engine = engine;
		this.weight = weight ;
		this.color = color;
	}
	Car(String model, Engine engine, String unknowk) {
		this.model = model;
		this.engine = engine;
		try {
			this.weight = Integer.valueOf(unknowk);
			this.color = null;
		} catch (NumberFormatException e) {
			this.weight = null;
			this.color = unknowk;
		}	
	}
}
