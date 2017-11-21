package pizzaCalories;

import java.util.Arrays;
import java.util.List;

public class Dough {

	private String type;
	private String property;
	private Double weight;
	private static List<String> allowedTypes = Arrays.asList("White", "Wholegrain", "Crispy", "Chewy", "Homemade");
	private Double modifireType;
	private Double modifireProperty;
	private Double totalCalories;

	Dough(String type, String property, String weight) {
		this.setType(type);
		this.setProperty(property);
		this.setWeight(weight);
		this.setModifireType();
		this.setModifireProp();
		this.setTotalCalories();
	}
	
	private void setType(String type) {
		if (!allowedTypes.contains(type))
			throw new IllegalArgumentException("Invalid type of dough.");
		this.type = type;
	}

	private void setProperty(String pr) {
		if (!allowedTypes.contains(pr))
			throw new IllegalArgumentException("Invalid type of dough.");
		this.property = pr;
	}

	private void setWeight(String weightStr) {
		Double weight = Double.valueOf(weightStr);
		if (weight < 1 || weight > 200)
			throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
		this.weight = weight;
	}

	private void setModifireType() {
		this.modifireType = this.type.equals("White") ? 1.5 
							: this.type.equals("Wholegrain") ? 1.0 
									: null;
	}

	private void setModifireProp() {
		this.modifireProperty = this.property.equals("Crispy") ? 0.9 
								:  this.property.equals("Chewy") ? 1.1 
								:  this.property.equals("Homemade") ? 1.0 
										: null;
	}

	private void setTotalCalories() {
		this.totalCalories = 2 * this.weight * this.modifireProperty * this.modifireType;
	}
	
	
	Double getTotalCalories(){
		return this.totalCalories;
	}
}
