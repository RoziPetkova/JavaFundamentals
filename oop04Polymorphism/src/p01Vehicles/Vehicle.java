package p01Vehicles;

public class Vehicle {
	// fuel quantity, fuel consumption in liters per km and can be driven given
	// distance and refueled with given liters
	private double fuelQuantity;
	private double fuelConsumption;

	Vehicle(double fuelQuantity, double fuelConsumption) {
		this.fuelQuantity = fuelQuantity;
		this.fuelConsumption = fuelConsumption;
	}
	
	//Setters
	protected void setFuelQuantity(double fuelQuantity) {
		this.fuelQuantity = fuelQuantity;
	}
	protected void setFuelConsumption(double add) {
		this.fuelConsumption += add;
	}
	public double getFuelQuantity() {
		return fuelQuantity;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}
	
	//Methods
	protected void dive(double km) {
		if (this.fuelQuantity < km * this.fuelConsumption)
			throw new IllegalArgumentException(String.format("%s needs refueling", this.getClass().getSimpleName()));
		this.fuelQuantity -= km * this.fuelConsumption;
	}
	protected void refuel(double ammound) {
		if (ammound < 0)
			throw new IllegalArgumentException("Daj oshte!");
		this.fuelQuantity += ammound;
	}
}
