package pizzaCalories;

import java.util.Arrays;
import java.util.List;

public class Toping {
	
	private String name;
	private static final List<String> allowedTopings = Arrays.asList("Meat", "Veggies", "Cheese", "Sauce");
	private Double weight;
	private Double modifire;
	private Double totalCalories;
	
	{
		System.out.println("fhgh");	
	}

	Toping(String name, String weight) {
		this.setName(name);
		this.setWeight(weight);
		this.setModifire();
		this.setTotalCalories();
	}

	
	private void setName(String name){
		if(!allowedTopings.contains(name))
			throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", name));
		this.name = name;
	}
	
	private void setWeight(String weightStr) {
		Double weight = Double.valueOf(weightStr);
		if(weight < 1 || weight > 50)
			throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.name));
		this.weight = weight;
	}
	
	private void setModifire() {
		this.modifire = this.name.equals("Meat") ? 1.2 
						: this.name.equals("Veggies") ?  0.8
						: this.name.equals("Cheese") ? 1.1 
						: this.name.equals("Sauce") ? 0.9 
						: null;
	}
	
	private void setTotalCalories() {
		this.totalCalories = 2 * this.weight * this.modifire;
	}
	
	Double getTotalCalories(){
		return this.totalCalories;
	}
	
}
