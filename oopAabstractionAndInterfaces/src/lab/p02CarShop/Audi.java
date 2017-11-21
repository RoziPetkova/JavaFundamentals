package lab.p02CarShop;

public class Audi implements Rentable{


	private Integer minRentDay;
	private Double pricePerDay;
	//private String countryProduced;
	private String model;
	private String color;
	private Integer horsePower;
	
	
	public Audi(String model,  String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
		this.minRentDay = minRentDay;
		this.pricePerDay = pricePerDay;
		//this.countryProduced = countryProduced;
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
	}
	
	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public Integer getHorsePower() {
		return this.horsePower;
	}

	@Override
	public Integer getMinRentDay() {
	 return this.minRentDay;
	}

	@Override
	public Double getPricePerDay() {
		return this.pricePerDay;
	}

	@Override
	public String toString() {
		return String.format("This is %s produced in %s and have %s tires", 
				this.getModel(), 
				this.getHorsePower(), 
				Car.TIRES);
	}
}
