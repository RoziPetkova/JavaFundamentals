package shopingSpree;

import java.util.LinkedList;
import java.util.List;

public class Person {
	// a name, money and a bag of products.

	private String name;
	private double money;
	List<Product> bouthProducts;

	// Constructor
	Person(String name, String money) {
		this.setName(name);
		this.setMoney(Integer.valueOf(money));
		bouthProducts = new LinkedList<Product>();
	}

	// Set name and price
	private void setName(String name) {
		if (name.trim().length() < 1)
			throw new IllegalArgumentException("Name cannot be empty");
		this.name = name;
	}

	private void setMoney(Integer money) {
		if (money < 0)
			throw new IllegalArgumentException("Money cannot be negative");
		this.money = money;
	}

	// Get name, price and products
	String getName() {
		return this.name;
	}

	Double getMoney() {
		return this.money;
	}

	List<Product> getbouthProducts() {
		return this.bouthProducts;
	}

	public void tryToBuy(Product prod) {
		if (this.money - prod.getPrice() < 0) {
			System.out.println(String.format("%s can't afford %s", this.name, prod.getProducatName()));			
		} else {
			this.money -= prod.getPrice();
			this.getbouthProducts().add(prod);
			System.out.printf("%s bought %s\n", this.name, prod.getProducatName());
		}
	}
}
