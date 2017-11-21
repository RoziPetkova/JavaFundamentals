package shopingSpree;

public class Product {
	
	private String producatName;
	private Integer price;
	
	//Constructor
	Product(String producatName, String price) {
		this.setProducatName(producatName);
		this.setPrice(Integer.valueOf(price));
	}
	
	//Set name and price
	private void setProducatName(String producatName) {
		if(producatName.trim().length() < 1)
			throw new IllegalArgumentException("Name cannot be empty");
		this.producatName = producatName;
	}

	private void setPrice(Integer price) {
		if(price < 0)
			throw new IllegalArgumentException("Money cannot be negative");
		this.price = price;
	}
	
	//Get name and price
	String getProducatName() {
		return producatName;
	}	
	Integer getPrice() {
		return price;
	}
	
	
	
	
	
}
