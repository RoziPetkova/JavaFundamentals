package pizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] line = reader.readLine().split("\\s+");
		Pizza thePizza = new Pizza(line[1], line[2]);
		line = reader.readLine().split("\\s+");
		thePizza.setDough(new Dough(line[1], line[2], line[3]));
		
		for (int i = 0; i < thePizza.getNumberOfToppings(); i++) {
			line = reader.readLine().split("\\s+");
			thePizza.addTopings(new Toping(line[1], line[2]));
		}	
		System.out.printf("%s - %.2f\n", thePizza.getName(), thePizza.getCalories());
		
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
	
	}

}
