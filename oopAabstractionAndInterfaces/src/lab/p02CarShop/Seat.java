package lab.p02CarShop;

public class Seat implements Sellable{

	//private String countryProduced;
	private String model;
	private String color;
	private Integer horsePower;
	private Double price;
	
	
	public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
	//	this.countryProduced = countryProduced;
		this.price = price;
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
	public Double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return String.format("This is %s produced in %s and have %s tires", 
				this.getModel(), 
				this.getHorsePower(), 
				Car.TIRES);
	}


	
}
