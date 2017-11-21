package fragileBaceClasses;

public class Main {

	public static void main(String[] args) {
		Predator animal = new Predator();
		animal.eat(new Food());
		System.out.println(animal.getHealth());
	}

}
