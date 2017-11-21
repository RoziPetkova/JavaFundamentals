package pizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private String name;
	private int numberOfTopings;
	private Dough dough;
	private List<Toping> topings;

	Pizza(String name, String numberOfTopings) {
	//	Class<Pizza> clazz = Pizza.class;
		this.setName(name);
		this.setNumberOfTopings(Integer.valueOf(numberOfTopings));
		topings = new ArrayList<Toping>();
	}

	public String getName() {
		return this.name;
	}
	private void setName(String name) {
		if (name.trim().length() < 1 || name.trim().length() > 15)
			throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
		this.name = name;
	}

	private void setNumberOfTopings(int numberOfTopings) {
		if (numberOfTopings < 0 || numberOfTopings > 10)
			throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
		this.numberOfTopings = numberOfTopings;
	}
	public int getNumberOfToppings() {
		return this.numberOfTopings;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public void addTopings(Toping topping) {
		this.topings.add(topping);
	}

	public Double getCalories() {
		return this.topings.stream().mapToDouble(x -> x.getTotalCalories()).sum() + this.dough.getTotalCalories();
	}

}
