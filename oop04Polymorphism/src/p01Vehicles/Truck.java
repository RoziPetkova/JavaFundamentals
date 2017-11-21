package p01Vehicles;

public class Truck extends Vehicle {

	Truck(double fuelQuantity, double fuelConsumption) {
		super(fuelQuantity, fuelConsumption);
		this.setFuelConsumption(1.6);
	}
	
	@Override
	protected void dive(double km) {
		super.dive(km);
	}
	
	@Override
	protected void refuel(double ammound) {	
		super.refuel(ammound * 0.95);
	}
}
