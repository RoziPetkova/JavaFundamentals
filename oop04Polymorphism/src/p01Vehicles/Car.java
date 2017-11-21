package p01Vehicles;

public class Car extends Vehicle{
	
	Car(double fuelQuantity, double fuelConsumption) {
		super(fuelQuantity, fuelConsumption);
		this.setFuelConsumption(0.9);
	}

	@Override
	protected void dive(double km) {
		super.dive(km);
	}
}
