package fragileBaceClasses;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	protected List<Food> foodEaten = new ArrayList<Food>();

	public final void eat(Food food) {
		this.foodEaten.add(food);
	}

	public final void eatAll(List<Food> food) {
		this.foodEaten.addAll(food);
	}
}
